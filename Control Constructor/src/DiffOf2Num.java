/* write a java program to find out difference of 2 numbers ensuring difference must be positive*/

import java.util.Scanner;

public class DiffOf2Num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers to find difference: ");
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b) {
			System.out.println("Diff ="+ (a-b));
		}else {
			System.out.println((b-a));
		}
		s.close();
	}

}
