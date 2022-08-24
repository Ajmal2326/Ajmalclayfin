package day1;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo
{
	public static void main(String[] args) 
	{
		LocalTime time=LocalTime.now();
		//System.out.println(time);
		
		//get the date time second and nano seconds 
		/*System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(	time.getNano());
											*/
		
		
		//add the date time second and nano second
		
		LocalTime t1=LocalTime.parse("06:30:14");
		
		System.out.println(t1);
	
		System.out.println(	t1.truncatedTo(ChronoUnit.MINUTES));
		
	
		
	}

}
