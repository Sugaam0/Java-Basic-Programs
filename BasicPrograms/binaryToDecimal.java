package BasicPrograms;
//convert binary to decimal



public class binaryToDecimal {
     static int conversion(long binary)
        {
            int decimalValue = 0,i=0;

            while(binary > 0)
                {
                    decimalValue += Math.pow(2, i++) * (binary %10);
                    binary/=10;
                }
                return decimalValue;
        }
        public static void main(String[] args) {
            int value = conversion(1011);
            System.out.println(value);
        }
}
