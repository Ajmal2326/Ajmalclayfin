package day1;

import java.util.Scanner;

public class CountWordsInString 
{
	public static void main(String[] args)
	{
		
		String para="This is my first company , the company name is clayfin, company is too good";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word ");
		String find=sc.next();
		
		int total=numberOfOccurance(para, find);
		if(total>0)
		System.out.println("The number of time word repeated is "+total);
		
	}
	
	public  static int numberOfOccurance(String para, String find)
	{
		String arr[]=para.split(" ");
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(find.equals(arr[i]))
			{
				count++;
			}
			
		}
		if(count==0)
		{
			System.out.println("The given word is not present");
		}
		
		return count;
		
	}

}
