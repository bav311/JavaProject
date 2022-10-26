package javarush;

public class Temp {
    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
        return 2 << (power - 1);
    }
}