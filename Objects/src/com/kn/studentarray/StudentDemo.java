package com.kn.studentarray;

public class StudentDemo {

	public static void main(String[] args) {

		Student s1 = new Student(1, "Amit", 83);
		Student s2 = new Student(2, "Akash", 92);
		Student s3 = new Student(3, "Ankur", 75);

		Student[] srr = new Student[3];

		srr[0] = s1;
		srr[1] = s2;
		srr[2] = s3;

//		for (int i = 0; i < srr.length; i++) {
//			if(srr[i].marks < 35) {
//			System.out.println(srr[i].name );
//			System.out.println("Existing marks = "+srr[i].marks);
//			System.out.println("After Grace");
//			
//			srr[i].marks = 35;
//			
//			System.out.println("Upgraded marks = "+srr[i].marks);
//		}
//		
//		}
		
		for (int i = 0; i < srr.length; i++) {
			for (int j = 0; j < srr.length - 1 - i; j++) {
				
				Student temp ;
				
				//swapping the array elements
				if (srr[j].marks > srr[j + 1].marks) {
					
					temp = srr[j];
					srr[j] = srr[j + 1];
					srr[j + 1] = temp;
					
				}
			}

		}
		
		for(int i=0; i<srr.length; i++) {
			System.out.println("ID = "+srr[i].id+ ", Name  = "+srr[i].name + ", Marks = "+srr[i].marks);
			
		}
	}

}
