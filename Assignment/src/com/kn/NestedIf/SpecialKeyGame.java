/*
You're creating a game that includes a feature to check if a player has found a special item in the game. 
The special item is found if the player has more than 10 gold coins, 
the player's level is above 5, and the player has a special key. 
The program should first check if the player has more than 10 gold coins and then if the player's level is above 5. 
If both conditions are met, the program should check if the player has the special key. If all conditions are met, 
it should print "Special Item Found".

Sample Input 1: Gold Coins - 12, Player Level - 6, Has Special Key - true
Sample Output 1: Special Item Found
Sample Input 2: Gold Coins - 8, Player Level - 7, Has Special Key - true
Sample Output 2: 
 */

package com.kn.NestedIf;

import java.util.Scanner;

public class SpecialKeyGame {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Gold Coins - ");
		int goldcoins = s.nextInt();

		System.out.println("Player Level -  ");
		int level = s.nextInt();

		System.out.println("Has Special Key(true or false) -  ");
		boolean specialKey = s.nextBoolean();

		isSpecialItemFound(goldcoins, level, specialKey);
		
		s.close();

	}

	static void isSpecialItemFound(int goldcoins, int level, boolean specialKey) {
		if (goldcoins > 10) {
			if (level > 5 && specialKey == true) {
				System.out.println("Special Item Found");
			} else {
				System.out.println("Special Item Not Found");
			}
		} else {
			System.out.println("Special Item Not Found");
		}
	}

}
