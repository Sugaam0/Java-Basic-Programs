//Remove duplicates from Sorted Array

package Array;


public class removeDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,4,5,5,5,6};
        int length =arr.length;
       

        length = removeElements(arr,length);

        System.out.println("The  array with no repeated elements  is : ");
        for(int i =0 ;i<=length-1;i++)
            {
                System.out.println(arr[i]);
            }
    }
    static int removeElements(int arr[], int length)
        {
            //returns if array is empty or contains only one element
            if(length ==0 || length == 1)
                {
                    return length;
                }
            int temp[] = new int[length];
            int j =0;

            for(int i =0;i<length-1;i++)
                {
                    if(arr[i] != arr[i+1])
                        {
                            temp[j++] = arr[i];
                        }
                    }
                    temp[j++] = arr[length - 1];

            for(int i =0 ;i<j;i++)
                {
                    arr[i] = temp[i];
                }
            return j;
                
            
        }
}
