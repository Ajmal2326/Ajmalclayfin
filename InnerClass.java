package day4;


class OuterClasss
{
	int x=10;
	public void show()
	{
		System.out.println("This is an outerclass");
	}
	
	class InnerClass
	{
		
		public void display()
		{
			System.out.println("This is an Innerclass");
		}
	}
}
public class InnerClass
{
	public static void main(String[] args)
	{
		OuterClasss oc=new OuterClasss();
		oc.show();
		
		OuterClasss.InnerClass ic=oc.new InnerClass();
		ic.display();
			

	
	}
}
