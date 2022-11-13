package javarush;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String[] array = {"1", "2"};
        addTwoNames(array);
                System.out.println(Arrays.toString(array));

    }

    public static void addTwoNames(String[] ar) {
        String [] newar = new String[0];
        newar = Arrays.copyOf(ar, newar.length + 2);

    }
}
