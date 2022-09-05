package day6;

import java.io.Reader;
import java.io.StringReader;

public class MarkInReader 
{
	public static void main(String[] args)
    {
  
        try {
  
            String str = "GeeksForGeeks";
            Reader reader= new StringReader(str);
            int ch;
  
            
            for (int i = 0; i < 10; i++) {
                ch = reader.read();
                System.out.print((char)ch);
            }
  
            System.out.println();
        
            reader.mark(3);
  
            reader.reset();
  
            for (int i = 0; i < 6; i++) {
                ch = reader.read();
                System.out.print((char)ch);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}


