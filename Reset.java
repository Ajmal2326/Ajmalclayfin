package JavaPractice;

import java.util.Locale;
import java.util.Scanner;

public class Reset 
{
public static void main(String[] args)
{
	String str="This/is an string reset method";
	Scanner sc=new Scanner(str);
	sc.useDelimiter("/");
	sc.useLocale(Locale.FRANCE);
	sc.useRadix(30);
	
	
//	while(sc.hasNext())
//	{
//		System.out.println(sc.next());
//	}
	System.out.println(sc.delimiter());
	System.out.println(sc.locale());
	System.out.println(sc.radix());
	
	sc.reset();
	System.out.println(sc.delimiter());
	System.out.println(sc.locale());
	System.out.println(sc.radix());
	
}
	
	
	

}
