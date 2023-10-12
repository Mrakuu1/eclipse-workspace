/*
 You're designing a program for a library which provides information about different book genres. 
The program should take a genre number as input and print the corresponding genre. 
Consider the following genres: 1 - Fiction, 2 - Non-Fiction, 3 - Fantasy, 4 - Mystery, 5 - Biography.

Sample Input 1: 3
Sample Output 1: Fantasy
Sample Input 2: 5
Sample Output 2: Biography
 */

package com.kn.SwitchCase;

import java.util.Scanner;

public class DifferentGenres {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number from 1-5 to check Genres of book: ");

		int num = s.nextInt();

		bookGenresInfo(num);
		
		s.close();
	}

	static void bookGenresInfo(int num) {
		switch(num) {
		case 0:
			System.out.println("Enter Valid number");
			break;
		case 1:
			System.out.println(num+ "-Fiction");
			break;
		case 2:
			System.out.println(num+ "-Non Fiction");
			break;
		case 3:
			System.out.println(num+ "-Fantasy");
			break;
		case 4:
			System.out.println(num+"-Mystery");
			break;
		case 5:
			System.out.println(num+ "-Biography");
			break;
			
			default:
				System.out.println("Options not available");
		}
	}

}
