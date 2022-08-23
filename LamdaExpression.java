package JavaPractice;

interface A
{
	public void show();
}
//class xyz implements A
//{
//	public void show() {
//		System.out.println("This is an show page");
//	}
//}
public class LamdaExpression 
{
	public static void main(String[] args) 
	{
//		A a=new A() {
//			public void show() {
//				System.out.println("This is an show page ");
//			}
//		};
//,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,		
//		The class which does not hava name is called annonymous class
		A a=()->
		{
			System.out.println("This is an show page");
		};
		a.show();
		
	}

}
