package ar.edu.et7;



import robocode.*;

import java.awt.Color;



/**

 * @autor marco agustin cliso

 * 

 */



public class Cliso extends AdvancedRobot {



	public void run() {

		// Configurar colores del robot

		setBodyColor(Color.BLACK);

		setGunColor(Color.RED);

		setRadarColor(Color.YELLOW);



		// Ajustar radar, cañón y robot independientes

		setAdjustRadarForRobotTurn(true);

		setAdjustRadarForGunTurn(true);

		setAdjustGunForRobotTurn(true);



		while (true) {

			// Movimiento en zigzag para evitar disparos

			setAhead(100);

			setTurnRight(45);

			execute();

			setBack(100);

			setTurnLeft(45); 

			execute();

			

			// Gira el radar continuamente para buscar robots

			setTurnRadarRight(360);

			execute();

		}

	}



	public void onScannedRobot(ScannedRobotEvent event) {

		double distance = event.getDistance();



		// Apunta al robot escaneado

		double absoluteBearing = getHeading() + event.getBearing();

		double bearingFromGun = normalRelativeAngleDegrees(absoluteBearing - getGunHeading());



		// Si el cañón está cerca del objetivo, dispara

		turnGunRight(bearingFromGun);

		if (distance < 100) {

			fire(Rules.MAX_BULLET_POWER);

		} else if (distance < 200) {

			fire(Rules.MAX_BULLET_POWER * 0.75);

		} else {

			fire(Rules.MAX_BULLET_POWER * 0.5);

		}



		// Ajusta el radar para seguir al objetivo

		if (distance < 200) {

			setTurnRadarRight(getHeading() - getRadarHeading() + event.getBearing());

		} else {

			setTurnRadarRight(360);

		}

	}



	public void onHitByBullet(HitByBulletEvent event) {

		// Movimiento evasivo al ser golpeado

		setBack(50);

		setTurnRight(45);

		execute();

	}



	public void onHitWall(HitWallEvent event) {

		// Al colisionar contra una pared, retrocede y gira

		setBack(20);

		setTurnRight(90);

		execute();

	}



	public void onBulletHit(BulletHitEvent event) {

		// Al acertar un disparo, imprime el nombre del robot impactado

		out.println("Le acerté un disparo a " + event.getName() + "!");

	}



	private double normalRelativeAngleDegrees(double angle) {

		double normalizedAngle = angle;

		while (normalizedAngle > 180) {

			normalizedAngle -= 360;

		}

		while (normalizedAngle < -180) {

			normalizedAngle += 360;

		}

		return normalizedAngle;

	}

}


