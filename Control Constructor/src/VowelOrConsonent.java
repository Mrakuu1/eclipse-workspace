/*  Write a program to accept a character and find out whether it is vowel or consonant */

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a character to find Vowel or Consonant: ");
		char c = s.next().charAt(0);
		
		if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'||c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U') {
			System.out.println("The entered character "+c+" vowel");
		}else{
			System.out.println("The entered character "+c+" consonant");
		}
	
		s.close();
	}

}
