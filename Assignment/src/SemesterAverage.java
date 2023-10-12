import java.util.Scanner;

public class SemesterAverage {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("===========Enter for Total marks of all the SEMESTERs=============");
		
		System.out.println("Enter your 1st sem marks: ");
		int s1=s.nextInt();
		
		System.out.println("Enter your 2nd sem marks: ");
		int s2=s.nextInt();
		
		System.out.println("Enter your 3rd sem marks: ");
		int s3=s.nextInt();
		
		System.out.println("Enter your 4th sem marks: ");
		int s4=s.nextInt();
		
		System.out.println("Enter your 5th sem marks: ");
		int s5=s.nextInt();
		
		System.out.println("Enter your 6th sem marks: ");
		int s6=s.nextInt();
		
		System.out.println("Enter your 7th sem marks: ");
		int s7=s.nextInt();
		
		System.out.println("Enter your 8th sem marks: ");
		int s8=s.nextInt();
		
		double Average = avgOf8sem(s1,s2,s3,s4,s5,s6,s7,s8);
		System.out.println("The Average of 8 Semester marks= "+Average);
		
		s.close();
	}

	private static double avgOf8sem(int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8) {
		return (s1+s2+s3+s4+s5+s6+s7+s8)/(double)8;
	}

}
