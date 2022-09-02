package Collection;

import java.util.Scanner;

public class CustomeException
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age for marriage");
		int age=sc.nextInt();
		
		if(age>60)
		{
			throw new TooOldException("You are too old , not eligible for marriage");
		}
		else if(age<18)
			throw new TooYoungException("you are too young, so please wait some time to get more than 18");
		else
			System.out.println("Thanks, your are eligible for marriage");
	}

}
class TooYoungException extends RuntimeException
{
	TooYoungException(String message)
	{
		super(message);
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String message)
	{
		super(message);
	}
}
