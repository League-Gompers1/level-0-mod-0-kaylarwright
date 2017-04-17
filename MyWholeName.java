package robot;

import org.jointheleague.graphical.robot.Robot;

public class MyWholeName {
	
	public static void main(String[] args) {
		
		Robot Kayla = new Robot();
		
	Kayla.penDown();
	Kayla.move(100);
	Kayla.move(-50);
	Kayla.turn(30);
	Kayla.move(50);
	Kayla.move(-50);
	Kayla.turn(100);
	Kayla.move(50);
	Kayla.penUp();
	Kayla.turn(90);


}
}
