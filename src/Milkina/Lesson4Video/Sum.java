package Milkina.Lesson4Video;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int summaNum, num1, num2;
        num1 = sum(scan);
        num2 = sum(scan);
        summaNum = num1 + num2;
        System.out.println("Сумма " + summaNum);
    }

    public static int sum(Scanner scan) {
        System.out.print("Введите целое число ");
        if (scan.hasNextInt()) {
            return scan.nextInt();
        } else {
            System.out.println("Число не целое");
            System.exit(0);
            return 0;
        }
    }
}
