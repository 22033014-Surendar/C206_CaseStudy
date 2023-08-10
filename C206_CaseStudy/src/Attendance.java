
public class Attendance {
	
	private String name;
	private String id;
	private String attendance;
	
	public Attendance(String name, String id, String attendance) {
		this.name = name;
		this.id = id;
		this.attendance = attendance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAttendance() {
		return attendance;
	}
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
	
	public void display() {
		System.out.println("\nStudent Name: " + name);
		System.out.println("Student ID: " + id);
		System.out.println("Attendance: " + attendance);
	}
}
