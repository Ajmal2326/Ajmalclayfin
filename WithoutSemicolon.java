package day4;

public class WithoutSemicolon
{
	public static void main(String[] args) 
	{
		//1.
		if(System.out.printf("hello clayfin"+"\n")==null)
		{
			
		}
		
		//2.
		if(System.out.append("hello clayfin"+"\n")==null)
		{
			
		}
		//3.
		if(System.out.append("hello world"+"\n").equals(null))
		{
			
		}
		for(int i=0;i<5;System.out.println("hello clayfin"))
		{
			i++;
		}
		
	}

}
