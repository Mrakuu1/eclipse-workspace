package com.kn.patterns;

public class RightInverseOfRAT {

	public static void main(String[] args) {
		regular();
//		reverse();
	}

	 
	static void regular() {
		 for (int i=1; i<=5; i++) {
				for (int j=1; j<=5; j++) {
					if(j<=(6-i)) {
//						print the star
//						System.out.print("*");
						
//						print i value
						System.out.print(i);
						
//						print column
//						System.out.print(j);
			
//						print Alphabets increasing row
//						System.out.print((char)(i+64));
						
//						print alphabets increasing column
//						System.out.print((char)(j+64));
						
						
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}		
	}
	
static void reverse() {
	for (int i=5; i>=1; i--) {
		for (int j=1; j<=5; j++) {
			if(j<=(6-i)) {
//				print the star
				System.out.print("*");
				
//				print i value
//				System.out.print(i);
				
//				print column
//				System.out.print(j);
	
//				print Alphabets increasing row
//				System.out.print((char)(i+64));
				
//				print alphabets increasing column
//				System.out.print((char)(j+64));
				
				
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}	
	}


}
