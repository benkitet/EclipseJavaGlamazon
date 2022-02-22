package models;

public class Employee {
	private int id;
	private String username;
	private String password;
	
	private void setId(int id) { this.id = id; }
	public int getId() { return this.id; }
	
	private void setUsername(String username) {	this.username = username; }
	public String getUsername() { return this.username; }
	
	private void setPassword(String password) {	this.password = password; }
	public String getPassword() { return this.password; }
	
	public Employee(int id, String username, String password) {
		this.setId(id);
		this.setUsername(username);
		this.setPassword(password);
	}
	
	public Employee() {
		this(0, "", "");
	}
	
	@Override
	public String toString() {
		return "Id: " + this.getId() + 
			   ", Username: " + this.getUsername() + 
			   ", Password: " + this.getPassword();
	}
}
