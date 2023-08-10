
public class Grade {
	
	private String name;
	private String grade;
	
	public Grade(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("\nStudent Name: " + name);
		System.out.println("Student Grade: " + grade);
	}
	
}

