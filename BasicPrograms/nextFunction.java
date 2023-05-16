package BasicPrograms;
import java.util.*;
// import java.io.*;

public class nextFunction {
    public static void main(String[] args) {

        //create an array
        ArrayList<String> list = new ArrayList<String>();

        //add elements in array
        list.add("mango");
        list.add("Apple");
        list.add("Banana");


        //declare iterator
        Iterator<String> iterator = list.iterator();

        //prints first value
        System.out.println(iterator.next());

        //prints second value
        System.out.println(iterator.next());

        //prints Last value
        System.out.println(iterator.next());

    }
}
