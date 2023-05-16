package MoreJavaProblems;

public class fibonacciSeries {
    public static void main(String[] args) {
        
        int n =10;
        fibonacci(n);
        
       
        }
    static void fibonacci(int n)
        {
        int numOne = 0;
        int numTwo= 1;
        int count = 0;
        
        while(count<n)
                {
                    System.out.println(numOne + " ");
                    int numThree = numOne + numTwo;
                    numOne = numTwo;
                    numTwo = numThree;
                    count = count+1;
                }
        }
}
