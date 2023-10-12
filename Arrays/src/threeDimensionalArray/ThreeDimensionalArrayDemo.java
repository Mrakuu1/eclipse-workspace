package threeDimensionalArray;

import java.util.Scanner;

public class ThreeDimensionalArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//Array Declaration and creation
		System.out.println("Enter the size of the array: ");
		int[][][] arr = new int[scan.nextInt()][][];
		
		//Array initialization		
		
//		arr[0] = new int[3][];
//		arr[0][0] =new int[1];
//		arr[0][1]= new int[2];
//		arr[0][2]= new int[3];
//		
//		arr[1]= new int[2][];
//		arr[1][0]= new int[1];
//		arr[1][1] = new int [1];
//		
//		arr[2] = new int[2][];
//		arr[2][0]= new int[1];
//		arr[2][1] = new int [1];
//		
//		arr[3] = new int[3][];
//		arr[3][0] = new int[1];
//		arr[3][1] = new int[2];
//		arr[3][2] = new int[2];
		
		//initialization of 2nd dimension
		for(int i=0; i<arr.length;i++) {
					System.out.println("Enter the size of index "+(i+1)+" in 2D");
					arr[i] = new int[scan.nextInt()][];
					
					
					for(int j=0; j<arr[i].length;j++) {			
					 System.out.println("Enter number of values to store in 2D index "+(j+1));
					 arr[i][j] = new int [scan.nextInt()];
					 
						 for(int k=0; k<arr[i][j].length; k++) {						
							System.out.println("Enter the values to be stored: ");
							arr[i][j][k]=scan.nextInt();
							
					}
				
			}
		}
		
		//Array traversing
		System.out.println("*****************************");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				for(int k=0; k<arr[i][j].length; k++) {
						System.out.println("         "+arr[i][j][k]+"          ");
				}
				 
					
			}
		}
		
		
		
		
		
	}

}
