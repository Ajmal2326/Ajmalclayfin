package jdbcConnection;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class Batch_JDBC 
{
	public static void main(String[] args) 
	{
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "root");
			Statement stmt=	con.createStatement();)
		{
				con.setAutoCommit(false);
				
				stmt.addBatch("INSERT INTO Student3 VALUES(112,'AKMAL','VELLORE')");
				stmt.addBatch("INSERT INTO Student3 VALUES(113, 'navya', 'Andra')");
				stmt.addBatch("INSERT INTO Student3 VALUES(114,'kishore', 'chennai')");
				stmt.addBatch("INSERT INTO Student3 VALUES(115,'LLUCKY','odisa')");
				int[] updatestudent= stmt.executeBatch();
				System.out.println(Arrays.toString(updatestudent));
				con.commit();
				
		}
			catch (BatchUpdateException e) {
				System.err.println("SQLState: " + e.getSQLState());
				System.err.println("Error Code: " + e.getErrorCode());
				System.err.println("Message: " + e.getMessage());
			}
			catch (SQLException e)
			{
				System.err.println("SQLState: " + e.getSQLState());
                System.err.println("Error Code: " + e.getErrorCode());
                System.err.println("Message: " + e.getMessage());
	  
			
			}
		
	}

}
