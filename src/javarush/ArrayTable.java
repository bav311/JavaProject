package javarush;

import java.util.Scanner;

public class ArrayTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] array = new int[n][];
        for (int i = 0; i < n; i++) {
            int size = scan.nextInt();
            array[i] = new int[size];
        }
new ArrayPrint(array);
    }
}



