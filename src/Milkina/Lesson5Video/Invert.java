package Milkina.Lesson5Video;

import java.util.Arrays;

public class Invert {
    public static void invert(int [] array) {
        System.out.print(Arrays.toString(array) + "==>");
        for (int i = 0; i < array.length/2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length -i -1] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }
}
