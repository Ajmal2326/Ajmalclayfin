package StreamApi;

import java.util.Iterator;
import java.util.stream.Stream;

public class ArrayIntoStream 
{

   
    private static <STring> void getStream(String[] arr)
    {
  
        Stream<String> streamOfArray = Stream.of(arr);
  
        Iterator<String> it = streamOfArray.iterator();
  
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
  
    public static void main(String[] args)
    {
  
        // Get the array
        String[] arr
            = new String[] { "a", "b", "c" };
  
        getStream(arr);
    }

}
