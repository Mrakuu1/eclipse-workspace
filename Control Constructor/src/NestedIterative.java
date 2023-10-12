
public class NestedIterative {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			System.out.println("i = "+i);
//			for(int j=1; j<=2; j--) {
//				System.out.println("j = "+j);
//			}
			
//			int j=1;
//			while(j<=2) {
//				System.out.println("j = "+j);
//				j++;
//			}
			
			int j=1;
			do {
				System.out.println("j = "+j);
				j++;
			}while(j<=2);
			
			System.out.println("Out of Inner Loop");
		}
		System.out.println("Out of Outer Loop");
		
		System.out.println("----The End----");
	}

}
