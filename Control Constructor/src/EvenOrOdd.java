/* Write a program take a number as an input and find out whether it is an even or odd number */

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a  number to find Even or Odd: ");
		int a= s.nextInt();
		if(a%2==0) {
			System.out.println("The given number is Even");
		}else {
			System.out.println("The given number is Odd");
		}
		s.close();
	}
	
}
