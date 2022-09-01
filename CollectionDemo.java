package Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo
{
	public static void main(String[] args) 
	{
		List li=new ArrayList();

		li.add("Ajmal");
		li.add(112);
		li.add('h');
		li.add(23.33);
		li.add(333);
		li.add(331);
		li.add(null);
		li.add("Akmal");
		
		for(int i=0;i<li.size();i++)
		{
			Object ob=li.get(i);
			if( (ob instanceof Double) || (ob instanceof Integer) )
			{
				System.out.println(ob);
			}
		}
		
		//Replace all the even number with odd number
		for(int i=0;i<li.size();i++)
		{
			Object ob1=li.get(i);
			
			if(ob1 instanceof Integer)
			{
				Integer it=(Integer)ob1;
				if(it%2==0)
				{
					li.set(i, it+1);
				}
			}
		}
		System.out.println(li);
		
		
		//Remove other than string and integer
		for(int i=0;i<li.size();i++)
		{
			Object obj=li.get(i);
			if(!(obj instanceof String) && !(obj instanceof Integer))
			{
				li.remove(i);
				i--; // this is an important steps in collection.
			}
		}
		System.out.println(li);
		
		
	}
}
