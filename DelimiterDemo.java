package JavaPractice;

import java.util.Scanner;

public class DelimiterDemo
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner("hellow-this-is scanner string");
		sc.useDelimiter("-| "); //This is used to split the string in how much value can split
		while(sc.hasNext()) {
			System.out.println(sc.next());
			
		}
		
		
	}

}
