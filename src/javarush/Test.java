package javarush;

public class Test {
    public static void main(String[] args) {
        System.out.println(ninthDegree(2, 3));

    }

    public static long ninthDegree(long num, long degree) {
        int result = 1;
        for (int i = 0; i < degree; i++) {
            result *= num;
        }
        return result;
    }
}