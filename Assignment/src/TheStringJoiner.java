/* Question: 4 
 Problem: The String Joiner
 
You are creating a new social networking site. 
In one of the features, you have to combine the user's first name and 
last name to display the full name.
 Your task is to write a static method that will concatenate two strings.
 
Method:
public static String joinStrings(String str1, String str2);
 
 
Inputs:
The method joinStrings(String str1, String str2) will receive two parameters:
- str1 :a string which represents the first string.
- str2 : a string which represents the second string.
 
Outputs:
The method will return a string - the result of concatenating str1 and str2.
 
Sample Input: 
joinStrings("Hello, ", "World!");
 
Sample Output: 
"Hello, World!"

Note: 
In the sample input, the method is given two strings: "Hello, " and "World!". 
These two strings are concatenated to form "Hello, World!", which is the output.
Make sure your method works properly to display the user's full name correctly 
on the social networking site.
  */

import java.util.Scanner;

public class TheStringJoiner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 strings: ");
//		String s1 =" ";
//		int i = 100;
//		int j = 200;
//		int r = 300;
//		System.out.println( i + j + s1 + r );
		
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		
		String s3 = joinStrings(s1,s2);
		System.out.println(s3);
		s.close();
	}

	 static String joinStrings(String s1, String s2) {
		return s1 + s2;
	}
}
