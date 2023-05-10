import java.util.*;
import java.io.*;

public class hasNext {
    public static void main(String[] args) {
        //create a arraylist with no elements
        ArrayList<String> list = new ArrayList<String>();
        //add two values as below

        list.add("Hello");
        list.add("Bye");

        //define iterator to loop through array
        Iterator<String> iterator = list.iterator();

        //using hasNext()
        //prints true because array has 2 more values
        System.out.println(iterator.hasNext());  //true

        //go to next value using .next()
        iterator.next();

        //prints ture because array still has one more value
        System.out.println(iterator.hasNext());   //true

        //go to next value
        iterator.next();

        //prints false because no elements are left in array
        System.out.println(iterator.hasNext());   //false
    }
}
