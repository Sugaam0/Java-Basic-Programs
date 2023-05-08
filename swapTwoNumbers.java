//Java Program to Swap Two Numbers

import java.util.Scanner;

public class swapTwoNumbers {
    public static void main(String[] args)
        {
            Scanner s1 = new Scanner(System.in);
            int a = s1.nextInt();
            int b = s1.nextInt();

            swapTwoNumbers(a,b);

            s1.close();
        }
        static void swapTwoNumbers(int a ,int b)
            {
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("value 1 = " + a + "value 2 = " + b);
    }

}



