package Array;

public class largestElementinArray {
    public static void main(String[] args) {
        int[] arr= {10,50,60,70,90};
        int length = arr.length;
        largestElement(arr,length);
        
    }
    static void largestElement(int arr[], int length)
        {
            int max = arr[0];
            for(int i = 0; i<=length-1;i++)
                {
                    if(arr[i] > max)
                        {
                            max = arr[i];
                        }
                }
            System.out.println("The largest element in array is " + max );
        }
}
