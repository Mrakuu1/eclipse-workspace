
public class TrianerApp {

	public static void main(String[] args) {
		Trainer t1  = new Trainer(1234,"Arun","JAVA");
//		t1.id = 1234;
//		t1.name = "Arun";
//		t1.skills = "JAVA";
		
		System.out.println("Trainer Name: "+t1.name+ "\nID: "+t1.id+"\nSkills: "+t1.skills);
		t1.train();
		t1.solveProblem();
		
		Trainer t2 = new Trainer(4567,"Yash","Testing");
		System.out.println("\nTrainer Name: "+t2.name+ "\nID: "+t2.id+"\nSkills: "+t2.skills);
		t2.train();
		t2.solveProblem();
	}

}
