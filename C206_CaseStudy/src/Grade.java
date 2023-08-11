public class Grade {	
	
	private String sID;	
	private String cID;
	private String grade;
	
	public Grade(String sID, String cID, String grade) {		
		this.sID = sID;
		this.cID = cID;		
		this.grade = grade;
		
	}	public String getStudentID() {
		return sID;
	}
	
	public void setStudentID(String sID) {		
		this.sID = sID;
	}
	
	public String getCourseID() {
		return cID;
	}
	
	public void setCourseID(String cID) {		
		this.cID = cID;
		
	}	public String getGrade() {
		return grade;
	}
		
	public void setGrade(String grade) {		
		this.grade = grade;
	}	
	public void display() {		
		System.out.println("\nStudent ID: " + sID);
		System.out.println("Course ID: + cID");		
		System.out.println("Student Grade: " + grade);
	}	
}