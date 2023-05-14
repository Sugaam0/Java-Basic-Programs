package Array;

public class copyElements {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};

        int[] arr2 = new int[arr1.length]; 
        System.out.println("The elements of First array is : ");
        for(int i =0;i<arr1.length;i++)
            {
                System.out.println("arr[" + i + "] = " + arr1[i]);
            }
        for(int i=0;i<arr1.length;i++)
            {
                arr2[i] = arr1[i];
            }
        System.out.println("The elements of Array 2 is ");
        for(int i =0;i<arr2.length;i++)
            {
                System.out.println("arr[" + i + "] = " + arr2[i]);
            }
    }
}
