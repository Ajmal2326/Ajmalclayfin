package day6;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class SkipInReader
{
	public static void main(String[] args) throws IOException {
		String str ="This is beautiful world ";
		Reader reader= new StringReader(str);
		System.out.println((char)reader.read());
		reader.skip(5);
		System.out.println((char)reader.read());
		reader.close();
	}

}
