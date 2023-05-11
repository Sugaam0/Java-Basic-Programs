package Array;
import java.util.*;

public class sorrtInDescending {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5};

        // The reverseOrder() method of Collections class that in itself
        // is present inside java.util package returns a comparator and 
        //using this comparator we can order the Collection in reverse order.
        // Natural ordering is the ordering imposed by the objects’ own compareTo method.
        
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0;i<=arr.length - 1 ;i++)
            {
                System.out.println(arr[i]);
            }
    }    
}
