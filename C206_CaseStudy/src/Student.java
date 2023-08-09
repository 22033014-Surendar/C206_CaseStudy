
public class Student {
	
	private String name;
	private String id;
	
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
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
		System.out.println("\nStudent ID: " + id);
		System.out.println("Student Name: " + name);
	}
	
}
