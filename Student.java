package Collection;

public class Student 
{
	private int id;
	private String name;
	private String place;
	public Student(int i, String string, String string2) {
		id=i;
		this.name=string;
		place=string2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", place=" + place + "]";
	}
	
	
	
	
}

