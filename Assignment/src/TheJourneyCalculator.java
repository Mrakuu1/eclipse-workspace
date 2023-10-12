/* Question 5:
Problem: The Journey Calculator
 
You are a developer at a transportation company. 
The company is developing a new app that helps users track their journey. 
One of the features of the app is to calculate the distance traveled given the speed and time
of the journey. 
Your task is to create a method that takes speed and time and returns the distance traveled. 
This method should be a non-static method and should be implemented inside a class named JourneyCalculator.
 
Class Definition:
 
public class JourneyCalculator {
    public double calculateDistance(double speed, double time);
}
 
 
Inputs:
 
The method calculateDistance(double speed, double time)  */

import java.util.Scanner;

public class TheJourneyCalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		JourneyCalci jc = new JourneyCalci();
		
		System.out.print("Enter Speed: ");
		double speed = s.nextDouble();
		
		System.out.print("Enter the time: ");
		double time = s.nextDouble();
		
		
		double Distance= jc.calculateDistance(speed, time);
		
		System.out.print("The distance travelled is: "+Distance);
		
		s.close();
	}

}
