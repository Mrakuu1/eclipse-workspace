
public class PuneriChai {

	public static void main(String[] args) {
		makeChai();
		makeChai(5);
	}

	static void makeChai() {
		System.out.println("The masala chai cost = 10");
	}

	static void makeChai(int quantity) {
		System.out.println("The masala chai for " + quantity + " cost =" + (quantity * 10));
	}
}
