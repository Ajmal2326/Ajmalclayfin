package Collection.project1;

import java.util.List;
import java.util.Scanner;

public class StudentMethods
{
	private List<Student> ss;
	private Scanner sc;
	
	public StudentMethods(List<Student> ss, Scanner sc)
	{
		this.ss=ss;
		this.sc=sc;
	}
	
	public void addMethod() 
	{
		Student s=readStudent();
		ss.add(s);
	}
	public Student readStudent()
	{
		System.out.println("Enter the Student name");
		String name=sc.next();
		System.out.println("Enter the student id");
		int id=sc.nextInt();
		System.out.println("Enter the student marks");
		double marks=sc.nextDouble();
		System.out.println("Enter the student number");
		Long number=sc.nextLong();
		
		 return new Student(name, id, marks, number);
	}
	public void removeMethod()
	{
		if(!ss.isEmpty())
		{
			System.out.println("Enter the Student id to remove");
			int id=sc.nextInt();
			
			for(int i=0;i<ss.size();i++)
			{
				if(ss.get(i).getId()==id)
				{
					ss.remove(i);
					displayMethod();
					return;
					
				}
				
				
			}
			System.out.println("The given id is not matching");
		}
		else
			System.out.println("list is empty, cannot remove");
	}
	
	public void displayMethod()
	{
		System.out.println("Name\t\tId\t\tMarks\t\tNumber");
		System.out.println("------------------------------");
		
		for(int i=0;i<ss.size();i++)
		{
			System.out.println(ss.get(i));
		}
		
	}
	public void searchMethod()
	{
		if(!ss.isEmpty())
		{
			System.out.println("Enter the Student id to search");
			int id=sc.nextInt();
			
			for(int i=0;i<ss.size();i++)
			{
				if(ss.get(i).getId()==id)
				{
					System.out.println("The given id will be exist");
					displayMethod();
					return;
					
				}
				
				
			}
			System.out.println("The given id is not matching");
		}
		else
			System.out.println("list is empty");
		
	}
	public void updateMethod()
	{
		System.out.println("What do want to update 1. Mobile or 2. marks");
		System.out.println("Enter the choice");
			int choice=sc.nextInt();
			if(choice==1)
			{
				updateMobile();
			}
			else
			{
				updateMarks();
			}
		
	}
	public void updateMobile()
	{
		System.out.println("Enter the id to update the mobile nimber");
		int id= sc.nextInt();
		
		for(int i=0;i<ss.size();i++)
		{
			if(ss.get(i).getId()==id)
			{
				System.out.println("Enter the Mobile number");
				Long num=sc.nextLong();
				ss.get(i).setNumber(num);
				System.out.println("After update the mobile number");
				displayMethod();
				return;
			}
		}
		System.out.println("The given id doesnot exit");
		
		
	}
	public void updateMarks()
	{
		System.out.println("Enter the id to update the marks");
		int d= sc.nextInt();
		
		for(int i=0;i<ss.size();i++)
		{
			if(ss.get(i).getId()==d)
			{
				System.out.println("Enter the marks");
				double x = sc.nextDouble();
				ss.get(i).setMarks(x);
				System.out.println("After update the marks");
				displayMethod();
				return;
			}
		}
		System.out.println("The given id doesnot exit");
		
		
	}
	public void sortMethod()
	{
		
	}

}
