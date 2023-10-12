package com.kn.validstringornot;

public class ValidStringOrNot {
	public boolean isValidStringOrNot(String inputString) {

		int paranthesis = 0;
		int curlyBraces = 0;
		int squareBraces = 0;
		int arrows = 0;

		char[] c = inputString.toCharArray();

		for (int i = 0; i < c.length; i++) {
			
				if (c[i] == '(') {
					paranthesis++;
				} 
				else if (c[i] == ')') {
					paranthesis--;
				}
				else if (c[i] == '{') {
					curlyBraces++;
				} 
				else if (c[i] == '}') {
					curlyBraces--;
				}
				else if (c[i] == '[') {
					squareBraces++;
				} 
				else if (c[i] == ']') {
					squareBraces--;
				}
				else if (c[i] == '<') {
					arrows++;
					
				}
				else if (c[i] == '>') {
					arrows--;
				}
			
		
		}
		if(paranthesis == 0 && curlyBraces == 0 && squareBraces == 0 && arrows == 0) {
			return true;
		}
		return false;
		
	}
}
