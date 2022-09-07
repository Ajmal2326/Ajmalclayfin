package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class preparedStatement_JDBC
{
	public static void main(String[] args) 
	{
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			PreparedStatement ppst=	con.prepareStatement("INSERT INTO Student3 VALUES(?,?,?)");)
		{
			ppst.setInt(1, 206);
			ppst.setString(2, "aaa");
			ppst.setString(3, "aaa");
			
			ppst.setInt(1, 207);
			ppst.setString(2, "bbb");
			ppst.setString(3, "bbb");
			
			ppst.setInt(1, 208);
			ppst.setString(2, "ccc");
			ppst.setString(3, "ccc");
			ppst.addBatch();
			ppst.executeUpdate();
			System.out.println("data hasbeen inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
