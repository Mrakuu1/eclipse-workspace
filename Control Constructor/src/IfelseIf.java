/*  Write a program to accept a character and find out whether it is vowel or consonant using if-else-if ladder */

import java.util.Scanner;

public class IfelseIf {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char ch= s.next().charAt(0);
		if(ch=='a'||ch=='A') {
			System.out.println("Given Character "+ch+" is a Vowel");
		}else if(ch=='e'||ch=='E') {
			System.out.println("Given Character "+ch+" is a Vowel");
		}else if(ch=='i'||ch=='I') {
			System.out.println("Given Character "+ch+" is a Vowel");
		}else if(ch=='o'||ch=='O') {
			System.out.println("Given Character "+ch+" is a Vowel");
		}else if(ch=='u'||ch=='U') {
			System.out.println("Given Character "+ch+" is a Vowel");
		}else {
			System.out.println("Given Character "+ch+" is a Consonant");
		}
		s.close();
	}

}
