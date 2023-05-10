package Array;
public class recursiveLinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int item = 5;
        int length = arr.length;
        int result = recursiveSearch(arr, 0, length-1, item);
        if(result==-1)
            {
                System.out.println("Element is not present in array");
            }
        else 
            {
                System.out.println("ELement is present in array at " + result + " index");
            }

    }
    static int recursiveSearch(int arr[], int l, int h, int item)
        {
            if(l>h)
                {
                    return -1;
                }
            else if(arr[l] == item)
                {
                    return l;
                }
            else if(arr[h]== item)
                {
                    return h;
                }
           
            return recursiveSearch(arr, l+1, h-1, item);
        }
}
