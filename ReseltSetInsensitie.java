package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReseltSetInsensitie 
{
	public static void main(String[] args) 
	{
		try( Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);)
		{
			ResultSet rs=stmt.executeQuery("select * from Student3");
			int temp=1;
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
				if(temp==2)
				{
					Thread.sleep(45000);
				}
				temp++;
			}
			
		} catch (SQLException | InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
