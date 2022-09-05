package day6;

import java.util.*;

public class Treeset implements Comparator<Integer>
{
	public static void main(String[] args) 
	{
		SortedSet<Integer> s= new TreeSet<Integer>(new TreeSet());
		s.add(121);
		s.add(444);
		s.add(12);
		s.add(6);
		s.add(77);
		s.add(655);
		System.out.println(s);
	}
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-01;
	}

}
