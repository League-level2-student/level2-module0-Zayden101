package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	
	//2. create an array of 5 robots.
	Robot[] robot = new Robot[5];	
	//3. use a for loop to initialize the robots.
	

	
	for(int i = 0; i<robot.length;i++) {
		System.out.println("a");
		robot[i]=new Robot();
		
		robot[i].setSpeed(25);

}
	

	
	boolean n = true;
	
	//4. make each robot start at the bottom of the screen, side by side, facing up

	for(int i = 0;i<robot.length;i++) {
		
		robot[i].setX((i*175)+100);
		robot[i].setY(500);

	}
	
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	
	
	
//	for (int i = 0; i < robot.length; i++) {
//		Random random = new Random();
//		if (robot[i].getY() == 0 || robot[i].getY() < 0) {
//			a = i;
//		}
//		robot[i].move(random.nextInt(50));
//	}

	
	
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	while(n == true) {
		for(int i = 0; i <5; i++) {
			

			for (int o = 0; i < robot.length; i++) {
				Random random = new Random();
				robot[i].move(random.nextInt(50));

				if (robot[i].getY() <= 0 || robot[i].getY() < 0) {
					n = false;
					
					//robot[i].miniaturize();
			
					System.out.println("Robot  "+i+"  Wins");
					
				}
				
				
			}
			
			
		}
		
	
	//7. declare that robot the winner and throw it a party!

	
	
	//8. try different races with different amounts of robots.

	
	
	//9. make the robots race around a circular track.
	
	
}
}
}

