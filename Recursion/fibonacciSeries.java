package Recursion;

public class fibonacciSeries {
        public static void main(String[] args) {
            int n = 10;

            for(int i = 0; i< n;i++)
                {
                    System.out.println(fibonacci(i)); 
                }
        }
    static int fibonacci(int n)
        {
            if(n<=1)
                {
                    return n;
                }
            return fibonacci(n-1) + fibonacci(n-2);

        }
}
