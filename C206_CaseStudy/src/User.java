
public class User {
	//Surendar Mayan 22033014
	
	private String username;
	private String password;
	private String role;
	
	public User(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	
	public String getrole() {
		return role;
	}
	public void setrole(String role) {
		this.role = role;
	}
	
	public void display() {
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		System.out.println("Role: " + role);
	}
	
}
