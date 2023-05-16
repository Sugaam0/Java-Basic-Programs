package BasicPrograms;
public class pattern3 {
    public static void main(String[] args)
        {
            pattern(5);
        }
    static void pattern(int n)
        {
            int i,j,k=0;
            for(i=1;i<=n;++i,k=0)
                {
                    for(j=1;j<=n-i;++j)
                        {
                            System.out.print(" ");
                        }
                    while(k !=2*i-1)
                        {
                            System.out.print("*");
                            ++k;
                        }
                    System.out.println();
                }
                
        }
}
