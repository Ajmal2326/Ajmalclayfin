package Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryResources
{
	public static void main(String[] args) throws IOException 
	{
		int x=0;
		
		//It will explicity close all the connection data base in the programe.
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			String str="";
			str=br.readLine();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
				
		
	}

}
