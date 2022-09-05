package day6;

import java.util.Scanner;

public class EncriptionAndDecriptionDemo
{
	public static void main(String[] args) 
	{
		Scanner  sc= new Scanner(System.in);
		System.out.println("Enter the string for decription");
		char[] ch= sc.nextLine().toCharArray();
		
		System.out.println("Enter the key in Integer ");
		int key=sc.nextInt();
		
		for( char value:ch)
		{
			value+=key;
			System.out.print(value);
		}
		
		
	}

}
