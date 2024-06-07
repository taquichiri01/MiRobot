package ar.edu.et7;

import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.Robot;

//TODO Renombrar este archivo y el nombre de la clase, 
//el nombre debe incluir el apellido del alumno

public class Alexander extends AdvancedRobot {
	
	public void run() {
		
		while(true) {
			
			//TODO modificar este bloque de código y recargar 
			//en Robocode presionando Restart
			
			setAllColors(Color.RED);
			
            ahead(150);

            turnGunRight(90);

            back(150);
            
            fire (10);

            turnGunRight(90);		
			
			getRadarHeading();
			
			fire(10);
			
			execute();		}
	
	}
}
