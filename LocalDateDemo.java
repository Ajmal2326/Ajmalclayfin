package JavaPractice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class LocalDateDemo
{
	public static void main(String[] args) 
	{
//		LocalDate ld=LocalDate.now();
//		
//		System.out.println(ld);
//		System.out.println(ld.getDayOfMonth());
//		
//		System.out.println(ld.getDayOfYear());
//
//		System.out.println(ld.getDayOfWeek());
//		
//		System.out.println(ld.getMonthValue());
//		
//		System.out.println(ld.getMonth());
//
//		System.out.println(ld.isAfter(ld));
//
//		System.out.println(ld.isBefore(ld));
//		
//	
//		System.out.println(ld.isEqual(ld));
//
//		System.out.println(ld.isLeapYear());
//		
		
		
		LocalDate id1=LocalDate.of(2000, 12, 22);
		LocalDate id2=LocalDate.of(2002, 5, 23);
		
		LocalDate ld=LocalDate.parse("1900-05-20");
		System.out.println(ld);
		System.out.println(id1);
		System.out.println(id2);
		System.out.println();
		

		System.out.println(id1.plusMonths(2));
		System.out.println(id2.plusDays(30));

		System.out.println(ld.plusYears(2));
		System.out.println(ld.plus(10,ChronoUnit.MONTHS));
		
		
		
		
	}

}
