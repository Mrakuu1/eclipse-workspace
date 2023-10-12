/*  Write a program take a number as an input and determine whether it is a Positive or negative number*/
import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a= s.nextInt();
		if(a>=0) {
			System.out.println("Positive");
		}else {
			System.out.println("Negative");
		}
		s.close();
	}

}
