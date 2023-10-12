
public class ChaiPoint {

	public static void main(String[] args) {
		makeChai();
		makeChai(5);
		makeChai("Ginger");
		makeChai("Elaichi", 4);
	}

	static void makeChai() {
		System.out.println("The chai cost = 10");
	}

	static void makeChai(int quantity) {
		System.out.println("The chai cost for " + quantity + " = " + (quantity * 10));
	}

	static void makeChai(String flavour) {
		System.out.println("The cost for " + flavour + " chai = 15");
	}

	static void makeChai(String flavour, int quantity) {
		System.out.println("The cost of " + quantity +" " + flavour + " chai = " + (quantity * 15));
	}
}
