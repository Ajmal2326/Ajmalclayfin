package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatement
{
	//using preparedstatemnt we can add multiple data in databases
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the how many data you want to add");
		int count= sc.nextInt();
		
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			java.sql.PreparedStatement ppst=con.prepareStatement("INSERT INTO Student3 VALUES(?,?,?)");)
		{
			for(int i=1;i<=count;i++)
			{
				System.out.println("Enter the student details");
				System.out.println("Enter the student id");
				int id=sc.nextInt();
				System.out.println("Enter the student name");
				String name=sc.nextLine();
				System.out.println("Enter the student location");
				String loc= sc.nextLine();
				
				ppst.setInt(1, id);
				ppst.setString(2,name);
				ppst.setString(3, loc);
				
				int result=ppst.executeUpdate();
				if(result==0)
					System.out.println("data is not inserted");
				else
					System.out.println("Data is inserted");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
