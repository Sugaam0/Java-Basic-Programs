public class pattern6 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n)
        {
            int row, col;
            for(row= 0;row < n;row++)
                {
                    int totalcols =  n - row;
                    int noofSpace =  row;
                    for(int s = 0; s< noofSpace;s++)
                        {
                            System.out.print(" ");
                        }
                    for(col = 0; col< totalcols;col++)
                        {
                            System.out.print("* ");
                        }
                    System.out.println();
                }
            for( row = 0 ; row < n-1 ; row++)
                {
                    int tcols = n-row ;
                    int spaces = row - 1;
                    for(int s = 0;s < spaces;s++)
                        {
                            System.out.print("  ");
                        }
                    for(col = 0; col < tcols;col++)
                        {
                            System.out.print(" * ");
                        }
                        System.out.println();
                }
        }
}
