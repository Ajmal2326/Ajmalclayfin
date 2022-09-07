package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BackwordResultSet 
{
	public static void main(String[] args) 
	{
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement stmt=	con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);)
		{
			ResultSet rs=stmt.executeQuery("select * from Student3");
			System.out.println("forword direction");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(1)+"\t\t"+rs.getString(3));
			}
			System.out.println("backword direaction");
			while(rs.previous())
			{
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(1)+"\t\t"+rs.getString(3));
			}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
