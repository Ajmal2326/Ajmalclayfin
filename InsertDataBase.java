package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataBase 
{
	private static final String INSERT_MULTIPLE_SQL= "INSERT INTO student3 VALUES(101,'ajmal' ,'chennai')";
	public static void main(String[] args) 
	{
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement stme=con.createStatement();)
		{
			int num=stme.executeUpdate(INSERT_MULTIPLE_SQL);
			System.err.println("The number of rows are affected are" +num);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("SQLState: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("Message: " + e.getMessage());
		}
		
	}

}
