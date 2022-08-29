package javarush;

public class Test {
    public static void main(String[] args) {
        System.out.println(isDivisible(12,4,3));
        System.out.println(isDivisible(3,3,4));
       

	   System.out.println(ninthDegree(2, 3));


    }

    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }

    public static long ninthDegree(long num, long degree) {
        int result = 1;
        for (int i = 0; i < degree; i++) {
            result *= num;
        }
        return result;
    }
}
