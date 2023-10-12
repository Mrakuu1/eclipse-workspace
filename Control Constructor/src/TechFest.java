import java.util.Scanner;

public class TechFest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your marks: ");
		int marks = scan.nextInt();
		if(marks>90) {
			System.out.println("Welcome to Tech Fest.....");
		}
		scan.close();
	}

}
