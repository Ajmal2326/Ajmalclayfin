package jdbcConnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createDataBase 
{
	private static final String  crateTable="CREATE TABLE Student3(student_id number(10) NOT NULL,student_name varchar2(50) NOT NULL, city varchar2(50))";
			
	public static void main(String[] args)
	{
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
				
			Statement stmt=	con.createStatement();)
		{
			stmt.execute(createDataBase.crateTable);
			System.out.println("Table is created");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("SQLState: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("Message: " + e.getMessage());
		}
	}
}
