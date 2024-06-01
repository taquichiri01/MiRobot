package ar.edu.et7;

import robocode.Robot;

/**
 * @author Jose Fuentes
 * 
 */

public class MiRobot extends Robot {

	public void run() {

		while (true) {

			//Desplaza el robot 100 pixels hacia adelante
			ahead(100);

			//Gira el cañon hacia la derecha 360 grados
			turnGunRight(360);

			//Desplaza el robot 100 pixels hacia atras
			back(100);

			//Gira el cañon hacia la izquierda 360 grados
			turnGunRight(360);
		}
	}
}
