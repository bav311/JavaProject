package javarush;
import java.util.Arrays;
import java.util.Scanner;

public class FillArray {
    public static void main(String[] args) {
        int valueStart = 8;
        int valueEnd = 7;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        if ((array.length % 2) == 0) {
            Arrays.fill(array, 0, array.length/ 2, valueStart);
            Arrays.fill(array, array.length/ 2, array.length, valueEnd);
        } else {
            Arrays.fill(array, 0, array.length/ 2+1, valueStart);
            Arrays.fill(array, array.length/ 2+1, array.length, valueEnd);        }

        System.out.println(Arrays.toString(array));

    }
}
