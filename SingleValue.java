package JavaPractice;

import java.util.Scanner;

public class SingleValue 
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		
		if(num>=1 && num<1000)
		{
			int sum=0;
			while(num>9)
			{
			sum=0;
			while(num>0)
			{
				int temp=num%10;
				sum=sum+temp;
				num=num/10;
			}
				num=sum;
				
			}
			System.out.println(sum);
			
		}
	}

	

}
