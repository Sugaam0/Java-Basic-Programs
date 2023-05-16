package BasicPrograms;
public class MathUtils {
    public static double average(int a, int b) {
        float result = (a+b)/2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(average(2,1));
    }
}
