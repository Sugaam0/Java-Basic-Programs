package BasicPrograms;
//Java Program to Check whether input character is vowel or consonant


public class checkCharacter {
    public static void main(String[] args)
        {
            String value = "a";
            if(value == "a" || value == "e" || value == "i" ||value == "o" ||value == "u")
                {
                    System.out.println("The entered character is Vowel");
                }
            else 
                {
                    System.out.println("The entered character is COnsonant");
                }
        }
}
