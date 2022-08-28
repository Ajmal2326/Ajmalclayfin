package day4;

public class FactroyPattern 
{
	public static void main(String[] args) 
	{
		FactoryMethdod fm= new FactoryMethdod();
		OS obj=fm.factoryCalculaion("mac");
		obj.operatingSystem();
		
	}

}

class FactoryMethdod
{
	public OS factoryCalculaion(String str)
	{
		if(str.equals("window"))
			
			return new Windows();
		else if(str.equals("linux"))
			return new Linux();
		else
			return new Mac();
	}
}
interface OS
{
	public void operatingSystem();
}
class Windows implements OS
{

	@Override
	public void operatingSystem() {
		System.out.println("This is an windows operating system");
		
	}
	
}
class Linux implements OS
{
	public void operatingSystem()
	{
		System.out.println("Compate to window, linux is faster");
	}
	
}
class Mac implements OS
{
	public void operatingSystem()
	{
		System.out.println("This is only using in apple laptop");
	}
}
