package Array;
import java.util.*;


public class removeElements {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int[] arr = new int[10];
            System.out.println("Enter the elements in array : ");
            for(int i =0;i< 10;i++)
                {
                    arr[i] = sc.nextInt();
                }
            System.out.println("The elements of arrays are : ");
                for(int i = 0;i<10;i++)
                    {
                        System.out.println("array [" + i + "] = " + arr[i]);
                    }
            System.out.println("ENter the index whose element is to be deleted");
            int index = sc.nextInt();
             removeElement(arr, index);
             sc.close();
           
    }
    static void removeElement(int arr[], int index)
        {
            int[] temp = new int[arr.length-1];
            int j =0;
            
            for(int i =0;i<arr.length;i++)
                {
                    if(i == index)
                        {
                            continue;
                        }
                        temp[j] = arr[i];
                        j++;
                }
                for(int i =0 ;i<temp.length;i++)
                    {
                        System.out.println(temp[i]);
                    }
                
        }
    
}
