package com.kn.studentapp;

public class StudentUtility {

	// method to search student data by id
	public void searchByID(Student[] srr, int id) {
		int low = 0;
		int high = srr.length - 1;

		boolean isFound = false;
		int mid = 0;
		while (low <= high) {

			mid = (low + high) / 2;

			if (id == srr[mid].id) {
				isFound = true;
				break;
			} else if (srr[mid].id < id) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}

		if (isFound) {
			System.out.println("ID = " + srr[mid].id + ", Name = " + srr[mid].name + ", Marks = " + srr[mid].marks);
		} else {
			System.out.println("ID not found");
		}
	}

	// method to search student data by name
	public void searchByName(Student[] srr, String name) {
		for (int i = 0; i < srr.length; i++) {
			if (srr[i].name.equalsIgnoreCase(name)) {
				System.out.println("ID = " + srr[i].id + ", Name = " + srr[i].name + ", Marks = " + srr[i].marks);
			}
		}

	}

	// method to sort marks
	public void sortByMarks(Student[] srr) {
		for (int i = 0; i < srr.length; i++) {
			for (int j = 0; j < srr.length - 1 - i; j++) {

				Student temp;

				// swapping the array elements
				if (srr[j].marks > srr[j + 1].marks) {

					temp = srr[j];
					srr[j] = srr[j + 1];
					srr[j + 1] = temp;

				}
			}

		}

		for (int i = 0; i < srr.length; i++) {
			System.out.println("ID = " + srr[i].id + ", Name  = " + srr[i].name + ", Marks = " + srr[i].marks);

		}

	}

	// method to apply grace
	public void applyGrace(Student[] srr) {
		for (int i = 0; i < srr.length; i++) {
			if (srr[i].marks < 35) {
				System.out.println(srr[i].name);
				System.out.println("Existing marks = " + srr[i].marks);
				System.out.println("After Grace");

				srr[i].marks = 35;

				System.out.println("Upgraded marks = " + srr[i].marks);
				break;
			} else {
				System.out.println("No student has marks less than 35");
			}

		}
	}

	// method to rate application
	public void rateApplication(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("* ");
		}
	}

}
