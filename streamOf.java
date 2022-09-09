package StreamApi;

import java.util.Iterator;
import java.util.stream.Stream;

public class streamOf 
{
	private static <T> void getStream(String[] arr)
    {
  
        // Create stream from an array
        // using Stream.of()
        Stream<String> streamOfArray = Stream.of(arr);
        
  
        // Iterate list first to last element
        Iterator<String> it = streamOfArray.iterator();
  
        // Iterate stream object
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
  
    public static void main(String[] args)
    {
  
        // Get the array
        String[] arr
            = new String[] { "a", "b", "c" };
  
        // Get the Stream from the Array
        getStream(arr);
    }

}
