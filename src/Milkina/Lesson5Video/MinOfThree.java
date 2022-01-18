package Milkina.Lesson5Video;
import java.util.Scanner;

public class MinOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number1 = getVel(scan);
        double number2 = getVel(scan);
        double number3 = getVel(scan);
        number1 = Math.min(number1, number2);
        number1 = Math.min(number1, number3);
        System.out.println("Наименьшее " + number1);

    }

    public static double getVel(Scanner scan) {
        System.out.print("Введите 3 числа ");
        if (scan.hasNextDouble()) {
            return scan.nextDouble();
        } else {
            System.out.println("Неверное число");
            return 0;
        }

    }
}
