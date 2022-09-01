package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeCollection 
{
	public static void main(String[] args) 
	{
		List li= new ArrayList();
		
		li.add("Ajmal");
		li.add(112);
		li.add('h');
		li.add(23.33);
		li.add(333);
		li.add(331);
		li.add(null);
		li.add("Akmal");
		
		//System.out.println(li.size());
		
	//To print the array in reverse formate
		//this just disply in reverse formate, but we need store last index in first index formate
		System.out.print(li+" ");
		System.out.println();
		for(int i=li.size()-1;i>-1;i--)
		{
			System.out.print(li.get(i)+" ");
		}
		
		// To swap value with the index position
		for(int i=0;i<li.size()/2;i++)
		{
			Object obj=li.get(i);
			li.set(i, li.get(li.size()-1-i));
			li.set(li.size()-1-i,obj); 
		}
		System.out.println();
		System.out.println(li);
		
		// To swap the value using Collectios method
		Collections.reverse(li);
		System.out.println(li);
		
		
	}

}
