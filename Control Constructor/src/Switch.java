import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter a character: ");
			
			char ch = s.next().charAt(0);
			
			switch (ch) {
			case 'v':
				System.out.println("Violet color");
				break;
			case 'i':
				System.out.println("Indigo color");
				break;
			case 'b':
				System.out.println("Blue color");
				break;
			case 'g':
				System.out.println("Green color");
				break;
			case 'y':
				System.out.println("Yellow color");
				break;
			case 'o':
				System.out.println("Orange color");
				break;
			case 'r':
				System.out.println("Red color");
				break;
			case 'V':
				System.out.println("Violet color");
				break;
			case 'I':
				System.out.println("Indigo color");
				break;
			case 'B':
				System.out.println("Blue color");
				break;
			case 'G':
				System.out.println("Green color");
				break;
			case 'Y':
				System.out.println("Yellow color");
				break;
			case 'O':
				System.out.println("Orange color");
				break;
			case 'R':
				System.out.println("Red color");
				break;
				
				default: 
					System.out.println("Not a Rainbow color");
			}
			
			
			
			s.close();
	}

}
