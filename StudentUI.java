package UILayer;

import java.time.LocalDateTime;

public class StudentUI 
{
	private int id;
	private String firstName;
	private String lastName;
	private double marks;
	private String location;
	private LocalDateTime dateTime;
	
	public StudentUI() {
		// TODO Auto-generated constructor stub
	}
	
	
	public StudentUI(int id, String firstName, String lastName, double marks, String location,
			LocalDateTime dateTime) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
		this.location = location;
		this.dateTime = dateTime;
	}
	public StudentUI( String firstName, String lastName, double marks, String location,
			LocalDateTime dateTime) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
		this.location = location;
		this.dateTime = dateTime;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return  id+"\t\t"+firstName+"\t\t\t"+lastName+"\t\t\t"+marks+"\t\t"+location+"\t\t\t"+dateTime ;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	
	

}
