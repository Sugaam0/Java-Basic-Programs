package Array;

import java.util.Arrays;

public class equalArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {1,2,3,4};

        boolean result = Arrays.equals(arr1,arr2);

        if(result == true)
            {
                System.out.println("Arrays are equal");
            }
        else 
            {
                System.out.println("Arrays are not equal");
            }
    }
}
