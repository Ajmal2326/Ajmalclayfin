package Collection.project1;

public class Student 
{
	private String name;
	private int id;
	private double marks;
	private Long number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public Student(String name, int id, double marks, Long number) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.number = number;
	}
	@Override
	public String toString() {
		return   name + "\t\t" + id + "\t\t" + marks + "\t\t" + number ;
	}
	
	
	

}
