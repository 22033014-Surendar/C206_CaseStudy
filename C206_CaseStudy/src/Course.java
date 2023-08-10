
public class Course {
	
	private String name;
	private String id;
	private String teacher;
	
	public Course(String teacher, String id, String name) {
		this.teacher = teacher;
		this.id = id;
		this.name = name;
	}
	
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("\nTeacher Name: " + teacher);
		System.out.println("Course ID: " + id);
		System.out.println("Student Name: " + name);
	}
	
}
