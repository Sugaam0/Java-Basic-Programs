
public class pattern5 {
    public static void main(String[] args) {
        pattern3(5);
    }

    static void pattern(int n)
        {
            int row,col;
            for(row = 0 ; row <= 2*n;row++)
                {
                    int totalcols = row > n ? 2 * n - row : row;
                    int noOfSPaces = n - totalcols;
                    for(int s = 0; s < noOfSPaces; s++)
                        {
                            System.out.print(" ");
                        }
                    for(col = 0 ; col < totalcols; col++)
                        {
                            System.out.print("* ");
                        }
                    System.out.println();
                }
        }
        static void pattern1(int n)
        {
            int row,col;
            for(row = 0 ; row <= n;row++)
                {
                    int noOfSPaces = n - row;
                    for(int s = 0; s < noOfSPaces; s++)
                        {
                            System.out.print(" ");
                        }
                    for(col = 0 ; col < row; col++)
                        {
                            System.out.print("* ");
                        }
                    System.out.println();
                }
        }
        static void pattern2(int n)
        {
            int row,col;
            for(row = 0 ; row < n;row++)
                {
                    int noOfSPaces =  row;
                    for(int s = 0; s < noOfSPaces; s++)
                        {
                            System.out.print(" ");
                        }
                    for(col = n ; col > row; col--)
                        {
                            System.out.print("* ");
                        }
                    System.out.println();
                }
        }
        static void pattern3(int n)
        {
            int row,col;
            for(row = 0 ; row < n;row++)
                {
                    int noOfSPaces =  row;
                    for(int s = 0; s < noOfSPaces; s++)
                        {
                            System.out.print("  ");
                        }
                    for(col = n ; col > row; col--)
                        {
                            System.out.print(" *");
                        }
                    System.out.println();
                }
        }
    
}
