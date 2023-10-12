/* Problem: Arithmetic Operations
 
You are a programmer in a school. 
The mathematics teacher has asked for your help to teach basic arithmetic operations to students.
Your task is to create a set of methods that will do subtraction, multiplication, division,
and find the remainder of two numbers.
 
Methods:
public static int subtractNumbers(int num1, int num2);
public static int multiplyNumbers(int num1, int num2);
public static double divideNumbers(int num1, int num2);
public static int findRemainder(int num1, int num2);
 
Inputs:
Each method will receive two parameters:
- num1 : an integer which represents the first number.
- num2 : an integer which represents the second number.
 
Outputs:
1. The subtractNumbers method will return an integer - the result of subtracting num2 from num1.
2. The multiplyNumbers method will return an integer - the result of multiplying num1 and num2.
3. The divideNumbers method will return a double - the result of dividing num1 by num2. Round off the result till 2 decimal places.
4. The findRemainder method will return an integer - the remainder when num1 is divided by num2.
 
Sample Input:
subtractNumbers(20, 5);
multiplyNumbers(4, 5);
divideNumbers(20, 4);
findRemainder(10, 3);
 
Sample Output:
15
20
5.00
1

 Note:
In the sample input, the numbers given to the methods are (20, 5), (4, 5), (20, 4) and (10, 3) respectively. 
The methods correctly return the results of subtraction, multiplication, division and finding the remainder.  */

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 2 numbers: ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		int difference = subtractNumbers(a, b);
		System.out.print("\nThe result of subtracting num2 from num1: "+difference);
		
		int product = multiplyNumbers(a, b);
		System.out.print("\nthe result of multiplying num1 and num2: "+product);
		
		double quotient = divideNumbers(a, b);
		System.out.format("\nthe result of diving num1 and num2: %.2f", quotient);  

		int remainder = findRemainder(a, b);
		System.out.print("\nthe remainder when num1 is divided by num2: "+remainder);
		s.close();
	}
	
	
	public static int subtractNumbers(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiplyNumbers(int num1, int num2) {
		return num1 * num2;
		
	}
	
	public static double divideNumbers(int num1, int num2) {
		return num1 / num2;
		
	}
	public static int findRemainder(int num1, int num2) {
		return num1 % num2;
		
	}
	
	
}
