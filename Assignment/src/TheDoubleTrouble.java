/* Problem: The Double Trouble
You are participating in a coding competition at your school. 
The challenge is to create a method that can double the value of any number provided.
This method will help in the game design where scores need to be doubled 
under certain conditions.
 
Method:
public static int doubleTheNumber(int num);
 


Inputs:
 The method doubleTheNumber(int num) will receive one parameter:
- num : an integer which represents the number to be doubled.
 
Outputs:
The method will return an integer - the result of doubling the num.
 
Sample Input: 
doubleTheNumber(15);
 
Sample Output:
30

Note: 
In the sample input, the number given to the method is 15. 
The double of this number is 15*2=30, so the method returns 30 as the output. 
Your method should work accurately to make sure you win this competition. 
Good Luck!  */

//import java.util.Scanner;

public class TheDoubleTrouble {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
		
//		System.out.print("Enter the number to check double value: ");
//		int a=s.nextInt();
	
		int rr = doubleTheNumber(40);
		System.out.print("The result of doubling the number: "+ rr);
//		s.close();
	}
	
	
	public static int doubleTheNumber(int num) {
		int res = num*2;
		return res;
	}
}
