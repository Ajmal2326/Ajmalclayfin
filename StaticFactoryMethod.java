package day4;

public class StaticFactoryMethod
{
	int x;
	int y;
	private StaticFactoryMethod() {
		x=10;
		y=20;
	}
	public static StaticFactoryMethod factory()
	{
		return new StaticFactoryMethod();
	}


}
class Main
{
	public static void main(String[] args)
	{
		StaticFactoryMethod st=StaticFactoryMethod.factory();
		System.out.println(st.x);
		System.out.println(st.y);
		
	}
}
