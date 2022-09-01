package Collection;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcards 
{
	public static void main(String[] args) 
	{
		
		List<Integer> ll = new ArrayList();
		ll.add(111);
		ll.add(123);
		ll.add(323);
		ll.add(433);
		System.out.println(Additional(ll));
		
		List<Double> dd = new ArrayList<>();	
		dd.add(111.0);
		dd.add(123.1);
		dd.add(323.2);
		dd.add(433.3);
		
		System.out.println(Additional(dd));
    }
	
	private static double Additional(List<? extends Number> list)
	{
		double add=0.0;
		for(Number i:list)
		{
			add+=i.doubleValue();
		}
		return add;
	}
}

 
   
		



