
public class Course {
	
	private String name;
	private String teacher;
	
	public Course(String teacher, String name) {
		this.teacher = teacher;
		this.name = name;
	}
	
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("\nTeacher Name: " + teacher);
		System.out.println("Student Name: " + name);
	}
	
}
