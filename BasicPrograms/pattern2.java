package BasicPrograms;
public class pattern2 {
    public static void main(String[] args)
        {
            pattern(5);
        }
    static void pattern(int n)
        {
            for(int  i = 0; i < n;i++)
                {
                    for(int j = 2 * (n-i); j>=0;j--)
                        {
                            System.out.print(" ");
                        }
                        for(int k = 0;k<=i;k++)
                            {
                                System.out.print("* ");
                            }
                    System.out.println();
                }
        }
}
