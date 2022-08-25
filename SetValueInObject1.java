package day1;

import java.util.Scanner;

public class SetValueInObject1 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		SetValueInObject a=new SetValueInObject();
		
		System.out.println("Enter the first name");
		String first=sc.next();
		System.out.println("Enter the last name");
		String last=sc.next();
		System.out.println("enter the id");
		int id=sc.nextInt();
		
		System.out.println("Enter the marks");
		double marks=sc.nextDouble();
		
		System.out.println("Enter the school name");
		String school=sc.nextLine();
		
		
		a.setFirstName(first);
		a.setLastName(last);
		a.setId(id);
		a.setMarks(marks);
		a.setSchoolName(school);
		
		System.out.println(" first name is"+a.getFirstName());
		System.out.println("last name is"+a.getLastName());
		System.out.println("Id is"+a.getId());
		System.out.println("marks is"+a.getMarks());
		System.out.println("school name is"+a.getSchoolName());
		
		
	}


}
