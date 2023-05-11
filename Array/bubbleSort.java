package Array;
import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        int arr[] = new int[10];
        System.out.println("Enter the elements of array : ");
        for(int i =0;i<=4;i++)
            {   
                arr[i] = sc.nextInt();
            }
        System.out.println("The entered elements are : ");
        for(int i =0;i<=4;i++)
            {
                System.out.println("array[" + i + "] = " + arr[i] );
            }
        for(int i =0;i<=4;i++)
            {
                for(int j = 0;j<=4-1;j++)
                    {
                        if(arr[j] > arr[j+1])   
                            {
                                temp = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1] = temp;
                            }
                    }
            }
        System.out.println("The sorted array is : ");
        for(int i =0;i<=4;i++)
            {
                System.out.println("array[" + i + "] = " + arr[i] );
            }
            sc.close();
    }
}
