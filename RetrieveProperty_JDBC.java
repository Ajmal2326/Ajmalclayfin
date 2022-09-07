package jdbcConnection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class RetrieveProperty_JDBC 
{
	public static void main(String[] args) throws IOException, SQLException 
	{
		FileReader fr = new FileReader("retrievefile.properties");
		BufferedReader br= new BufferedReader(fr);
		Properties ppr= new Properties();
		ppr.load(br);
		//System.out.println(ppr);
		String url=(String)ppr.get("url");
		String user=(String)ppr.get("user");
		String pass=(String)ppr.get("password");
		//System.out.println(url+" "+user+" "+pass);
		
		//Alliter way to print the data
		
//		System.out.println(br.toString());
//		String temp;
//		while((temp=br.readLine())!=null)
//		{
//			System.out.println(temp);
//		}
		try(Connection con=DriverManager.getConnection(url,user,pass);
				Statement stmt=	con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);)
		{
			ResultSet rs=stmt.executeQuery("select * from Student3");
			System.out.println("forword direction");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(1)+"\t\t"+rs.getString(3));
			}
	}
	}
}
