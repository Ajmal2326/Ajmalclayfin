package Model;

import java.time.LocalDateTime;
import java.util.Scanner;

import ServiceLayer.IStudentService;
import ServiceLayer.StudentServiceImplement;
import UILayer.StudentUI;

public class StudentManagement 
{
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		IStudentService Istudent= new StudentServiceImplement();
		while(true)
		{
			System.out.println("1. AddStudent\n2. DeleteStudent\n3. UpdateStudent\n4. DisplayStudent\n5.GetStudentName\n6.GetStudentId\n7.exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:getInput();
				break;
		case 2:	Istudent.deleteStudent();
				break;
		case 3:Istudent.updateStudent();
				break;
		case 4:Istudent.displayStudent();
				break;
		case 5:Istudent.getStudentName();
				break;
		case 6:Istudent.getStudentId();
				break;
		case 7:System.exit(0);
		}
	}
}

	public static void getInput()
	{
	
		
			System.out.println("Enter the firstName");
			String fname=sc.next();
			
			System.out.println("Enter the lastName");
			String lname=sc.next();
			
			System.out.println("Enter the student marks");
			double marks=sc.nextDouble();
			
			System.out.println("Enter the location");
			String loc=sc.next();
			sc.nextLine();
			
			System.out.println("Enter the date and time, formate is YYYY-MONTH-DATE_T_HOUR:MINUIT:SECOND");
			String datetime=sc.nextLine();
			
			LocalDateTime ldt=LocalDateTime.parse(datetime);
			
			StudentUI student= new StudentUI(fname, lname, marks, loc, ldt);
			
			IStudentService Istudent= new StudentServiceImplement();
			Istudent.addStudent(student);
			
		
		
	}


	

}
