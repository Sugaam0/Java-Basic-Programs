package ExceptionHandling;

import java.util.*;


public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try 
            {
        System.out.println("ENter numerator : ");
        int a = sc.nextInt();

        System.out.println("ENter denominator : ");
        int b = sc.nextInt();

         int i = computeDivision(a, b);
        System.out.println("result = " + i);
            }
        catch(ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
            sc.close();
    }
    static int computeDivision(int a , int b)
        {
            int res = 0;

            try 
                {
                    res = divideByZero(a,b);
                }
            catch(NumberFormatException e)
                {
                    System.out.println("NumberFormatException is caught");
                }
            return res;
            
        }
    static int divideByZero(int a, int b)
        {
            int i = a/b;

            return i;
        }
}
