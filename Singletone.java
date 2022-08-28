package day4;

public class Singletone 
{
	public static void main(String[] args) 
	{
		Demo d1= Demo.createMethod();
		Demo d2=Demo.createMethod();
		Demo d3= Demo.createMethod();
	}
}
class Demo
{
	private static Demo d= new Demo();
	private Demo()
	{
	}
	public static Demo  createMethod()
	{
		return d;
	}
}
