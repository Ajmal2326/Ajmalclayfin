package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectiosMethods
{
	public static void main(String[] args)
	{
		List l=new ArrayList();
		l.add(12);
		l.add("ajmal");
		l.add(null);
		l.add(true);
		l.add(12.22);
		
	//	System.out.println(l);
		System.out.println(l.contains(12));
//		Iterator it=l.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		
		
		ListIterator ll=l.listIterator();
		while(ll.hasNext())
		{
			System.out.print(ll.next()+" ");
			System.out.println();
			
		}
		
		while(ll.hasPrevious())
		{
			System.out.print(ll.previous()+" ");
		}
		
		
	}

}
