package viewExamGrades;

import java.io.*;
import java.util.Scanner;



public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		Interface studentInterface = new Interface();
		
		File studentFile = new File("Students.txt");
		Scanner studentSc = new Scanner(studentFile);
		
		File gradeFile = new File("Grades.txt");
		Scanner gradeSc = new Scanner(gradeFile);
		
		Student[] studentLogins = new Student[10];
		Grade[] grades = new Grade[10];
		
		
		String garb;
		
		String[] ID = new String[10];
		String[] pass = new String[10];
		String[] gradeID = new String[10];
		String[] OOP= new String[10];  
		String[] SE = new String[10];
		
		int i=0;
		for(i=0; i<10; i++) {
			gradeID[i] = gradeSc.next();
			garb = gradeSc.next();
			OOP[i] = gradeSc.next();
			garb = gradeSc.next();
			SE[i] = gradeSc.next();
			SE[i] = SE[i].replace("\n", "").replace("\r", "");
		}
		
		for(i=0; i<10; i++) {
			ID[i] = studentSc.next();
			pass[i] = studentSc.next();
			pass[i] = pass[i].replace("\n", "").replace("\r", "");
		}
		
		for(i=0; i<10; i++) {
			studentLogins[i] = new Student(ID[i], pass[i]);
			grades[i] = new Grade(gradeID[i], OOP[i], SE[i]);
		}
		
		while(true) {
			boolean temp = false;
			studentInterface.login();
			for(i=0; i<10; i++) {
				temp = studentLogins[i].loginCheck(studentInterface.getStudentID(), studentInterface.getPassword());
				if (temp==true)
					break;
			}
			if (temp==true)
				break;
			
			else {
				System.out.println("Student ID and password not valid, please enter another ID and password");
			}
		}
		
		int gradeIndex=0;
		for(i=0; i<10; i++) {
			if(studentInterface.getStudentID().equals(grades[i].getStudentID()))
				gradeIndex = i;
		}
		
		studentInterface.setCourse();
		studentInterface.displayGrades(grades[gradeIndex]);		
		
		studentSc.close();
		gradeSc.close();
	}
}
