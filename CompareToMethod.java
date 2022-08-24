package day1;

import java.time.LocalTime;

public class CompareToMethod
{
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalTime time1=LocalTime.parse("05:15:30");
		LocalTime time3=LocalTime.parse("05:15:30");
		LocalTime time2=LocalTime.now();
		
		
		System.out.println(time);
		System.out.println(time2);
		
		int compare=time1.compareTo(time3);
		System.out.println(compare);
		if(compare>0)
		{
			
			System.out.println("The first time is grater"+time);
			
		}
		else if(compare<0)
		{
			System.out.println("The current time is greater"+time1);
			
		}
		else
			System.out.println("The both the time area equal");
	}

}
