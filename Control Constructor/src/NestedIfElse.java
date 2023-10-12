
public class NestedIfElse {

	public static void main(String[] args) {
		int a = 7;
		if(a>=10){
			System.out.println("If Body");
			if(a>15) {
				System.out.println("Inner If Body");
			}else{
					System.out.println("Inner Else Body");
				}
			}
		else {
			System.out.println("Else Body");
				if(a>5) {
					System.out.println("Nested Else If");
				}else {
					System.out.println("Nested Else Else");
				}
			}
		System.out.println("-------The End-------");
	}

}
