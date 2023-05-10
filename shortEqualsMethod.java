

public class shortEqualsMethod {
    public static void main(String[] args) {
        Short a = new Short("20");

        Short b = new Short("2");

        boolean result = a.equals(b);

        System.out.println("Is " + a + " equals " + b +":" + result);
    }    
}
