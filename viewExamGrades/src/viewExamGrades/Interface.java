package viewExamGrades;

import java.util.Scanner;

public class Interface {
	private String course, studentID, password;
	
	void login() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your Stuednt ID : ");
		studentID = input.next();
		
		System.out.println("Enter your password : ");
		password = input.next();
		
		
	}
	
	void setCourse() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your course: ");
		course = input.next();
		input.close();
	}
	
	
	public String getStudentID() {
		return studentID;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	void displayGrades(Grade grades) {
		if(course.equals("CS2365")) 
			System.out.println(grades.getOOPGrade());
		else
			System.out.println(grades.getSEGrade());
	}
}


