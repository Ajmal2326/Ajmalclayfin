package day1;

import java.util.Scanner;

public class ValidIpAddress
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the IP address");
		String value=sc.next();
		
		checkIpAddress(value);
	}

	public static void checkIpAddress(String value) {
		
		String arr[]=value.split("[.]");
		
		int arr1[]=new int[arr.length];
		int count=0;
		if(arr1.length==4)
		{
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=Integer.parseInt(arr[i]);
			if(arr1[i]<=255 && arr1[i]>=0)
			{
				
				count++;
			}
			
		}
		if(count==4)
		{
			System.out.println("The given ip address is valid");
		}
		else
			System.out.println("The given ip address is not valid");
		}
		else
			System.out.println("The given id is not valid");
		
		
		
	}

}
