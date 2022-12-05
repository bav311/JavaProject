/*Моральный блок Стального Стива заполнен вредоносными элементами,
которые делают пиратского капитана очень кровожадным и аморальным.

В этой задаче требуется в методе cleanMorals исправить статический массив
morals класса Solution, заменив негативные моральные элементы на позитивные.

Для этого требуется:

Заменить все элементы, в которых присутствует текст "killer" (без учета регистра), на слово "compassion" (сострадание).
Заменить все элементы, в которых присутствует текст "thief" (без учета регистра), на слово "fairness" (справедливость).
Заменить все элементы, в которых присутствует текст "bully" (без учета регистра), на слово "respect" (уважение).
Метод main не участвует в проверке.

Требования:
Не изменяй массив morals в классе Solution.
Метод cleanMorals должен изменять массив morals согласно условиям.*/

package javarush.string;

public class MoralStive {
    public static String[][] morals = {
            {"iAmAKiller", "iAmAThief", "honesty", "responsibility", "iAmABully"},
            {"BuLLyIAmA", "honesty", "iamakiller", "iamathief", "responsibility"},
            {"honesty", "iamabully", "responsibility", "AthiefIAm", "ikillerAmA"},
    };

    public static void main(String[] args) {
        print(morals);
        cleanMorals(morals);
        System.out.println();
        print(morals);


    }

    public static void print(String[][] array) {
        for (String[] arr : array) {
            for (String m : arr) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    public static void cleanMorals(String[][] arrStrings) {
        for (int i = 0; i < arrStrings.length; i++) {
            for (int j = 0; j < arrStrings[i].length; j++) {
                if (arrStrings[i][j].toLowerCase().contains("killer")) {
                    arrStrings[i][j] = "compassion";
                }
                else if (arrStrings[i][j].toLowerCase().contains("thief")) {
                    arrStrings[i][j] = "fairness";
                }
                else if (arrStrings[i][j].toLowerCase().contains("respect")) {
                    arrStrings[i][j] = "respect";
                }
            }
        }
    }


}