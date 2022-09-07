package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete_JDBC 
{
	public static void main(String[] args) 
	{
		try(Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement stmt=	con.createStatement();)
		{
			int count=stmt.executeUpdate("delete from Student3 where student_id=112");
			if(count==1)
			{
				System.out.println("successfully deleted the student information");
			}
			
		} catch (SQLException e) {
			System.err.println("SQLState: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("Message: " + e.getMessage());
		}
		
	}

}
