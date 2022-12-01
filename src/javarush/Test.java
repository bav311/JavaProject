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
        for (String[] strings : morals) {
            System.out.println(Arrays.toString(strings));
        }
        System.out.println();

        cleanMorals(morals);
        for (String[] strings : morals) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public static void cleanMorals (String [][] oldMorals){
        for (int i = 0; i < oldMorals.length; i++) {
            for (int j = 0; j < oldMorals[i].length; j++) {
                if (morals[i][j].toLowerCase().contains("KiLLer".toLowerCase())) {
                    morals[i][j] = "compassion";
                }
/*                if (morals[i][j].toLowerCase().contains("killer")) {
                    int path = morals[i][j].toLowerCase().indexOf("killer");
                    String word = morals[i][j].substring(path, path + 6);
                    morals[i][j] = morals[i][j].replace(word, "compassion");
                }

                if (morals[i][j].toLowerCase().contains("thief")) {
                    int path = morals[i][j].toLowerCase().indexOf("thief");
                    String word = morals[i][j].substring(path, path + 5);
                    morals[i][j] = morals[i][j].replace(word, "fairness");
                }

                if (morals[i][j].toLowerCase().contains("bully")) {
                    int path = morals[i][j].toLowerCase().indexOf("bully");
                    String word = morals[i][j].substring(path, path + 5);
                    morals[i][j] = morals[i][j].replace(word, "respect");
                }*/
            }

        }
    }


}