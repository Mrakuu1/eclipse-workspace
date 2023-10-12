package com.kn.ploymorphism.softwareengineer;

public class SoftwareEngineerDemo {

	public static void main(String[] args) {

		SoftwareEngineer se = new SoftwareEngineer();

		BackendEngineer be = new BackendEngineer();
		DatabaseEngineer de = new DatabaseEngineer();
		JavaBackendEngineer je = new JavaBackendEngineer();
		PythonBackendEngineer pe = new PythonBackendEngineer();
		
		doActivity(se);
		System.out.println("*****************************************************************");
		doActivity(be);
		System.out.println("*****************************************************************");
		doActivity(de);
		System.out.println("*****************************************************************");
		doActivity(je);
		System.out.println("*****************************************************************");
		doActivity(pe);
		System.out.println("*****************************************************************");

	}

	public static void doActivity(SoftwareEngineer se) {
		se.attendMeeting();
		se.doTesting();

		if (se instanceof BackendEngineer) {
			((BackendEngineer) (se)).doBackendProject();
		} else if (se instanceof DatabaseEngineer) {
			((DatabaseEngineer) (se)).doDatabaseProject();
			((DatabaseEngineer) (se)).learnSQL();
		} else if (se instanceof JavaBackendEngineer) {
			((JavaBackendEngineer) (se)).doBackendProject();
			((JavaBackendEngineer) (se)).learnJava();
		} else if (se instanceof PythonBackendEngineer) {
			((PythonBackendEngineer) (se)).doBackendProject();
			((PythonBackendEngineer) (se)).learnPython();
		}
	}

}
