/*С помощью псевдослучайных чисел нужно подобрать правильное число,
иначе корабль будет навеки потерян в космической аномалии.

Класс CosmicAnomaly содержит верхнюю и нижнюю границу,
в которых содержится правильное число, которое нужно угадать.
Эти границы можно использовать для генерации случайного числа,
которое затем нужно передать в метод nextAttempt() класса CosmicAnomaly.

Если попытка была неудачной, то надо воспользоваться обновленными значениями границ
(lowerBound и upperBound), чтобы сгенерировать новое случайное число, и повторить попытку.
Скорее всего, тебе придется делать это в цикле.

Если число было угадано, то метод nextAttempt() вернет то же самое число, которое в него передали.
Тогда программу можно завершить, Амиго и Диего спасены!

Требования:
Класс CosmicAnomaly изменять нельзя.
Метод main() должен вызывать метод nextAttempt() до тех пор,
пока тот не вернет то же число, с которым его вызвали.
Подобрать правильное число нужно менее чем за 30 попыток.*/

package javarush;

import java.util.Random;

public class CosmicAnomaly {
    private static final int rightNumber = new Random().nextInt(1000);

    public static int lowerBound = 0;
    public static int upperBound = 1000;

    private static int attemptsCount = 0;

    public static int nextAttempt(int attempt) {
        attemptsCount++;
        System.out.printf("Попытка № %d: %d%n", attemptsCount, attempt);
        int result;

        if (rightNumber > attempt) {
            lowerBound = attempt;
            result = upperBound;
        } else if (rightNumber < attempt) {
            upperBound = attempt;
            result = lowerBound;
        } else {
            System.out.println("Правильно!");
            return attempt;
        }

        System.out.printf("Неа :( Новый диапазон: (%d;%d)%n%n", lowerBound, upperBound);
        return result;
    }
}
