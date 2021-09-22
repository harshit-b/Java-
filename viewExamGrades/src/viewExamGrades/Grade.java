package viewExamGrades;

public class Grade {
	private String studentID, OOPGrade, SEGrade;
	
	public Grade(String userID, String OOPGrade, String SEGrade) {
		this.studentID = userID;
		this.SEGrade = SEGrade;
		this.OOPGrade = OOPGrade;
	}
	
	public String getOOPGrade() {
		return OOPGrade;
	}
	
	public String getSEGrade() {
		return SEGrade; 
		
	}
	
	public String getStudentID() {
		return studentID;
	}
}
