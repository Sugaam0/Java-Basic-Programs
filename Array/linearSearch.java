package Array;
//Java Program for Linear Search

import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 5 elements of array : ");
        int[] arr =  new int[5];
        for(int i =0;i<=4;i++)
            {
                arr[i] = sc.nextInt();
            }
        int n = arr.length;
        System.out.print("Enter value to check if it is present in array or not : ");
        int input = sc.nextInt();
        
        int result = searchArray(arr, n, input);
        
        if(result == 1 )
                {
                    System.out.println(input + " is present in the array");
                }   
        else if(result == -1)
                {
                    System.out.println(input + " is not present in the array");
                }
            sc.close();
    }
    static int searchArray(int[] a , int n , int x)
        {
            for(int i=0;i<=n-1;i++)
            {
                if(x == a[i])
                    {
                        return 1;
                    }
                }
                return -1;
        }
}   
