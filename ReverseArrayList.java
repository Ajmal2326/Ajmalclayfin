package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseArrayList implements Comparator<Integer>
{
	public static void main(String[] args)
	{
		List<Integer> it= new ArrayList<Integer>();
		it.add(12);
		it.add(44);
		it.add(66);
		it.add(1772);
		it.add(6);
		it.add(9);
		
	Collections.sort(it);
	System.out.println(it);
	Collections.reverse(it);
	System.out.println(it);
	Collections.sort(it,new ReverseArrayList());
	System.out.println(it);
	 }
	@Override
	public int compare(Integer i1, Integer i2)
	{
		return i2.compareTo(i1);
	}
	

}
