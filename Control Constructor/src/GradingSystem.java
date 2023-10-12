/*  Write a program to take CGPA as an input from the user & if 

CGPA>=90 -->A grade ||
 >=75 -->B grade ||
 >=60 -->C  grade ||
 >=45 -->D grade ||
 >=35 --> E grade ||
 <35 --> Try again...!!
 */

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your marks: ");
		int a=s.nextInt();
		
		if(a>=90) {
			System.out.println("A grade");
		}else if(a>=75 && a<90){
			System.out.println("B grade");
		}else if(a>=60 && a<75){
			System.out.println("C grade");
		}else if(a>=45 && a<60){
			System.out.println("D grade");
		}else if(a>=35 && a<45){
			System.out.println("B grade");
		}else if(a<35){
			System.out.println("Try again");
		}
		s.close();
	}

}
