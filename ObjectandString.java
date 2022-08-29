package day4;

public class ObjectandString 
{
	public static void main(String[] args)
	{
		subclass sb=new subclass();
		sb.display(null);
	}

}
class subclass
{
	public void display(Object obj)
	{
		System.out.println("This is an object method");
	}
	public void display(String str)
	{
		System.out.println("This is an String method");
	}
}