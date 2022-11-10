package javarush.solution;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(11));
        }

        public static int getPowerOfTwo (int power) {
        return 2 << (power);
        }
    }