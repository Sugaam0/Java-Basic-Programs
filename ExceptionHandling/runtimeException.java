//Exception are the events which occurs during the runtime of
//of program that disrupts the flow of programs.

//Exception handling is the method of detecting and handling the 
// exception so that they don't disrupts the flow of computer program.

package ExceptionHandling;
import java.util.*;

public class runtimeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try 
            {
                System.out.println("Enter numerator : ");
                int a = sc.nextInt();

                System.out.println("Enter denominator : ");
                int b = sc.nextInt();
        
                System.out.println("Result = " + a/b);
            }
        catch(ArithmeticException e)
            {
                // System.out.println("Exception caught : " + e.getMessage());
                 System.out.println("Exception caught : " + e.toString());

            }
        catch(InputMismatchException e)
            {
                // System.out.println("Exception caught : " + e.getMessage());
                System.out.println("Exception caught : " + e.toString());

            }
            sc.close();
    }
}
