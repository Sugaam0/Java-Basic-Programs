package ExceptionHandling;
import java.util.*;


public class multipleCatch {
    public static void main(String[] args) {
        int array[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();

        try 
            {
                array[10] = 30/num;
            }
        catch(ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
        catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e.getMessage());
            }
        sc.close();
    }
}
