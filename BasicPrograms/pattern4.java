package BasicPrograms;
public class pattern4 {
    public static void main(String[] args) {
        pattern2(5);
    }
static void pattern(int n)
    {
        int i,j;
        for(i=n;i>=1;i--)
            {
                for(j=1;j<=i;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
            }
    }

    static void pattern1(int n)
    {
        int i,j;
        for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
                    {
                        System.out.print(j);
                    }
                    System.out.println();
            }
    }

    static void pattern2(int n)
    {
        int row,col;
        for(row=0;row< 2 * n; row++)
            {
                int totalColns = row > n ? 2 * n - row : row;
                for(col=0;col< totalColns;col++)
                    {
                        System.out.print("*");
                    }
                 System.out.println();
            }
    }
}
