package javarush;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String[] ar = {"1", "2"};
        System.out.println(Arrays.toString(addTwoNames(ar)));

    }

    public static String[] addTwoNames(String[] ar) {
        return Arrays.copyOf(ar, ar.length + 2);
    }
}
