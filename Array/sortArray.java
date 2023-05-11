package Array;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] arr = {5,7,1,2,1,9};
        int length = arr.length;
        System.out.println("The unsorted array is : ");

        for(int i =0; i<=length-1;i++)
            {
                System.out.println(arr[i]);
            }
        //sort the array usng .sort() function

        Arrays.sort(arr);
            System.out.println("The sorted array is ");
            for(int i=0;i<=length-1;i++)
                {
                    System.out.println(arr[i]);
                }
    }
}
