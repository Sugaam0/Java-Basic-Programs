package BasicPrograms;
//Java Program to Display All Prime Numbers from 1 to N

public class primeNumber {

    static void prime(int n)
        {
            int temp=1;
            for(int i=1;i<=n;i++)
                {
                    temp=1;
                    for(int j=2;j<=n;j++)
                        {
                            if(i%j==0)
                                {
                                    temp++;
                                }
                        }
                        if(temp==2)
                            {
                                System.out.println(i);
                            }
                }
        }
    public static void main(String[] args)
        {
            prime(45);
        }
}
