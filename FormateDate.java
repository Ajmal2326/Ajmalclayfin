package day1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class FormateDate 
{
	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd:MMM:yyyy");
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("E/MM/yyyy");
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("E,dd:MMM:YYYY");
			
		String rt=ld.format(dtf1);
		String rt1=ld.format(dtf2);

		String rt2=ld.format(dtf3);

		String rt3=ld.format(dtf);
		System.out.println(ld);
		System.out.println(rt);
		System.out.println(rt1);
		System.out.println(rt2);
		System.out.println(rt3);
	}

}
