package ServiceLayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import UILayer.StudentUI;
import repositryLayer.IStudentImplementation;

public class StudentServiceImplement implements IStudentService 
{
	static List<StudentUI> ss=new ArrayList<StudentUI>();
	Scanner scan= new Scanner(System.in);
	@Override
	public void addStudent(StudentUI student)
	{
		IStudentImplementation dao= new IStudentImplementation();
		student.setId(generateId());
		ss.add(student);
		//dao.addStudent(student);

		System.out.println("**************Data Stored***************");
		
	}

	public int generateId() {
			
		return (int)(Math.random()*1000);
	}

	@Override
	public void deleteStudent() {
		if(!ss.isEmpty())
		{
			System.out.println("Enter the student id to remove");
			int num= scan.nextInt();
			for(int i=0;i<ss.size();i++)
			{
				if(ss.get(i).getId()==num)
				{
				ss.remove(i);
				displayStudent();
				return;
				}
			}
		}
		else
			System.out.println("The given id is not matching");
		}

	@Override
	public void updateStudent() 
	{
		System.out.println("what do want to update 1:marks 2:localtion");
		System.out.println("Enter the choice 1 or 2");
		int number =scan.nextInt();
		if(number==1)
		{
			updateMarks();
		}
		else
		{
			updateLocation();
		}
	}
	public void updateMarks()
	{
		System.out.println("Enter the id to update marks");
		int marks=scan.nextInt();
		
		for(int i=0;i<ss.size();i++)
		{
			if(marks==ss.get(i).getId())
			{
				System.out.println("Enter the marks to update");
				int n1=scan.nextInt();
				ss.get(i).setMarks(n1);
				System.out.println("After update the marks are");
				displayStudent();
				
			}
		}
	}
	public void updateLocation()
	{
		System.out.println("Enter the id to update location");
		int id1=scan.nextInt();
		
		for(int i=0;i<ss.size();i++)
		{
			if(id1==ss.get(i).getId())
			{
				System.out.println("Entet the location to update");
				String loc=scan.next();
				ss.get(i).setLocation(loc);
				System.out.println("After update the location are");
				displayStudent();
			}
		}
	}

	@Override
	public void displayStudent() {
		System.out.println("ID\t\tFirstName\t\tLastName\t\tMark\t\tLocation\t\tDateAndTime");
		System.out.println("***************************************************************************************************************************");
		for(int i=0;i<ss.size();i++)
		{
			System.out.println(ss.get(i));
		}
		
	}

	@Override
	public void getStudentName() {
		if(!ss.isEmpty())
		{
			System.out.println("Enter the student FirstName");
			String fname=scan.nextLine();
			for(int i=0;i<ss.size();i++)
			{
				if(fname.equals(ss.get(i).getFirstName()))
				{
					System.out.println(ss.get(i));
				}
				else
					System.out.println("name is not matching");
			}
		}
		
	}

	@Override
	public void getStudentId() {
		if(!ss.isEmpty())
		{
			System.out.println("Enter the student id");
			int id1=scan.nextInt();
			for(int i=0;i<ss.size();i++)
			{
				if(id1==ss.get(i).getId())
				{
					System.out.println(ss.get(i));
				}
				else
					System.out.println("The given id is not matching");
			}
		}
		
	}

	

	
	

}
