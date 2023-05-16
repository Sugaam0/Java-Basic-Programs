package BasicPrograms;
//convert given binary value to octal

public class binaryToOctal {
    static int binaryToDecimal(long binary)
        {
            int decimalValue = 0;
            int i=0;

            while(binary > 0)
                {
                    decimalValue += Math.pow(2,i++) * (binary%10);
                    binary /=10;
                }
            return decimalValue;
        }
    static long decimaltoOctal(int decimal)
        {
            int remainder; 
            long octal = 0, i = 1;
   
            while(decimal != 0) {
                remainder = decimal%8;
                octal = octal + (remainder*i);
                decimal = decimal/8;
                i = i*10;
    }
    return octal;
        }
    public static void main(String[] args) {
        int decimalValue = binaryToDecimal(101100);
        long octalValue = decimaltoOctal(decimalValue);
        System.out.println(octalValue);
    }
}
