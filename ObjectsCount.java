package JavaPractice;

public class ObjectsCount 
{
	private static int temp;
	
	public ObjectsCount() {
		temp++;
	}
	
	public static void main(String[] args) 
	{
		ObjectsCount ob=new ObjectsCount();
		ObjectsCount ob1=new ObjectsCount();
		ObjectsCount ob2=new ObjectsCount();
		ObjectsCount ob3=new ObjectsCount();
		ObjectsCount ob4=new ObjectsCount();
		
		System.out.println("The count of the objects is " +ObjectsCount.temp);
		
		
	}

}
