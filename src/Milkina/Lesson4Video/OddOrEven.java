package Milkina.Lesson4Video;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        oddOrEven(scan);
    }

    public static void oddOrEven(Scanner scan) {
        System.out.print("Введите число ");
        if (scan.hasNextInt()) {
            int i = scan.nextInt();
            if (i % 2 == 0) {
                System.out.println("Четное " + i);
            } else {
                System.out.println("Нечетное " + i);
            }
        }

    }
}
