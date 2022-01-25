package temp;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        do {
            game(scan, random);
        } while (scan.nextInt() == 1);

    }

    private static void game(Scanner scan, Random random) {
        int counter = 3;
        int guessed = -1;
        int hidden = random.nextInt(10);
        System.out.println(hidden);

        while (hidden != guessed && counter > 0) {
            System.out.println("Угадай число (0...9) с " + counter +"-x попыток");
            guessed = scan.nextInt();
            if (guessed != hidden) {
                System.out.println("Ваше число " +
                        ((guessed > hidden) ? "больше" : "меньше"));
            }
            counter--;
        }
        System.out.println("Вы " +
                ((hidden == guessed) ? "выиграли" : "проиграли"));
        System.out.println("Сыграем еще раз? ДА - 1, НЕТ - 0");
    }


}
