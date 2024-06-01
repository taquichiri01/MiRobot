package ar.edu.et7;

import robocode.Robot;
import robocode.Rules;

/**
 * @author Jose Fuentes
 * 
 */

public class MiRobot extends Robot {

	public void run() {

		while (true) {

			//Desplaza el robot 100 pixels hacia adelante
			ahead(100);

			//Gira el cañon hacia la derecha 90 grados
			turnGunRight(90);

			//Dispara con la maxima potencia
			fire(Rules.MAX_BULLET_POWER);

			//Desplaza el robot 100 pixels hacia adelante
			ahead(100);
			
			//Gira el cañon hacia la derecha 180 grados
			turnGunLeft(180);

			//Dispara con la maxima potencia
			fire(Rules.MAX_BULLET_POWER);

			//Gira hacia la izquierda 90 grados
			turnLeft(90);
			
			//Gira el radar hacia la izquierda 15 grados
			turnRadarLeft(15);
		}
	}
}
