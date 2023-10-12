
public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.id = 1234;
		s1.name = "Akash";
		s1.cgpa = 7.0;
		
		System.out.println("Name = "+ s1.name +" \nId= "+ s1.id+"\nCGPA= "+ s1.cgpa);
		s1.study();
		s1.markAttendance();
	}

}
