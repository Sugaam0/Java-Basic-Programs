package Array;
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6};

        int length = arr.length;
        int num = 3;
        int result = searchArray(arr,0,length-1,num);

        if(result==-1)
            {
                System.out.println("Element is not present in array");
            }
        else
            {
                System.out.println("Element is present at " + result + " index");
            }

    }
    static int searchArray(int arr[] , int lowerIndex, int higherIndex, int item)
        {
            if(higherIndex>=lowerIndex)
            {
                    int middle = (lowerIndex + higherIndex)/2;
                    if(arr[middle] == item)
                        {
                            return middle;
                        }
                    else if(arr[middle] > item)
                        {
                            return searchArray(arr, lowerIndex, middle-1, item);
                        }
                    else if(arr[middle] < item)
                        {
                            return searchArray(arr, middle +1, higherIndex, item);
                        }
            }
        return -1;
        }
}
