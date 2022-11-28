/*Моральный блок Стального Стива заполнен вредоносными элементами,
которые делают пиратского капитана очень кровожадным и аморальным.

В этой задаче требуется в методе cleanMorals исправить статический
массив morals класса Solution, заменив негативные моральные элементы на позитивные.

Для этого требуется:
Заменить все элементы, в которых присутствует текст "killer" (без учета регистра), на слово "compassion" (сострадание).
Заменить все элементы, в которых присутствует текст "thief" (без учета регистра), на слово "fairness" (справедливость).
Заменить все элементы, в которых присутствует текст "bully" (без учета регистра), на слово "respect" (уважение).
Метод main не участвует в проверке.
Требования:
Не изменяй массив morals в классе Solution.
Метод cleanMorals должен изменять массив morals согласно условиям.*/
package javarush;
import java.util.Arrays;

public class Test {
    public static String[][] morals = {
            {"iAmAKiller", "iAmAThief", "honesty", "responsibility", "iAmABully"},
            {"BuLLyIAmA", "honesty", "iamakiller", "iamathief", "responsibility"},
            {"honesty", "iamabully", "responsibility", "AthiefIAm", "ikillerAmA"},
    };
    public static void main(String[] args) {

//        cleanMorals();
        for (String[] strings : morals) {
            System.out.println(Arrays.toString(strings));
        }
    }
}