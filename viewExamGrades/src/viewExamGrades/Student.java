package viewExamGrades;

public class Student {
	private String studentID, password;
	
	public Student(String userID, String pass) {
		this.studentID = userID;
		this.password = pass;
	}
	
	public String getStudentID() {
		return studentID;
	}
	
	public String getPassword() {
		return password; 
		
	}
	
	boolean loginCheck(String userID, String userPass) { 
		if (studentID.equals(userID) && password.equals(userPass)) 
			return true;
		else
			return false;
	}
}
