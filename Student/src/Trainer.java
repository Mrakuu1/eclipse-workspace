
public class Trainer {
	int id;
	String name;
	String skills;
	
	void train() {
		System.out.println("Trains student...");
	}
	
	void solveProblem() {
		System.out.println("Solves the problem....");
	}
	
	Trainer (int a,String b,String c){
		id = a;
		name = b;
		skills = c;
	}
}
