package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot[] bot = new Robot[5];
	//3. use a for loop to initialize the robots.
for(int i = 0; i<5;i++) {
	bot[i] = new Robot();
	bot[i].setX(180*i+80);
	bot[i].setY(520);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
Random ran = new Random();
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Robot ref = new Robot();
ref.setY(80);
ref.setX(0);
ref.penDown();
ref.setSpeed(10);
ref.turn(90);
ref.move(1000);
while(true) {
for(int i = 0; i<5;i++) {
	bot[i].setSpeed(10);
	bot[i].move(ran.nextInt(50));
	if(bot[i].getY()<=90) {
		bot[i].setSpeed(30);
		bot[i].setY(100);
		bot[i].turn(720);
		System.out.println("ROBOT " + (i+1) + " WINS!");
		System.exit(0);
	}
}
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
