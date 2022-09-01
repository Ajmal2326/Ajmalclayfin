package Collection.project1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		StudentMethods sm=new StudentMethods(new ArrayList<Student>(), sc);
		
		while(true)
		{
			System.out.println("1.Add\n2.remove\n3.display\n4.search\n5.Update\n6.sort\n7.exit");
			System.out.println("Enter your choice");
			int num=sc.nextInt();
			
			switch(num)
			{
			case 1: sm.addMethod();
					break;
			case 2: sm.removeMethod();
					break;
			case 3: sm.displayMethod();
					break;
			case 4: sm.searchMethod();
					break;
			case 5: sm.updateMethod();
					break;
			case 6: sm.sortMethod();
					break;
			case 7: System.exit(0); 
				
			}
		}
		
		
	}

}
