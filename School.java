package JavaPractice;

public class School 
{
public static void main(String[] args) 
{
	Encapsulation encp=new Encapsulation();
	encp.setFirstName("ajmal");
	encp.setLastName("basha");
	encp.setId(02);
	encp.setMarks(76.0);
	encp.setSchoolName("Thiruvalluvar school");

	System.out.println(encp.getFirstName());
	System.out.println(encp.getLastName());
	System.out.println(encp.getId());
	System.out.println(encp.getMarks());
	System.out.println(encp.getSchoolName());
	
 }
}
