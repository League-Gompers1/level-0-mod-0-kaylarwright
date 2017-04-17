package robot;

import org.jointheleague.graphical.robot.Robot;

public class FirstNameLetter {
	public static void main(String[] args) {
		Robot Kayla = new Robot();
		
		Kayla.setSpeed(10);
		Kayla.penDown();
		Kayla.move(300);
		Kayla.move(-150);
		Kayla.turn(45);
		Kayla.move(250);
		Kayla.move(-250);
		Kayla.turn(100);
		Kayla.move(250);
		
	}

}
