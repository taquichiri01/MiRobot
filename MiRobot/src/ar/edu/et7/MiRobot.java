package ar.edu.et7;

import robocode.Robot;

/**
 * @author Jose Fuentes
 * 
 */

public class MiRobot extends Robot {

	public void run() {

		while (true) {

			ahead(100);

			turnGunRight(360);

			back(100);

			turnGunRight(360);
		}
	}
}
