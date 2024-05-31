package ar.edu.et7;

import robocode.Robot;


//TODO Renombrar este archivo y el nombre de la clase, 
//el nombre debe incluir el apellido del alumno

public class MiRobot extends Robot {
	
	public void run() {
		
		while(true) {
			
			//TODO modificar este bloque de código y recargar 
			//en Robocode presionando Restart
            ahead(100);

            turnGunRight(360);

            back(100);

            turnGunRight(360);		}
	}
}
