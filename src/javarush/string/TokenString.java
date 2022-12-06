//ЗАДАЧА https://javarush.com/help/83528
/*Используя StringTokenizer раздели query на части по разделителю delimiter.

Пример:
getTokens("java.util.stream", "\\.")
возвращает массив строк
{"java", "util", "stream"}

Hint: решить задачу поможет метод countTokens().

Требования:
Нужно, чтобы метод getTokens(String, String) использовал StringTokenizer.
Нужно, чтобы метод getTokens(String, String) возвращал массив типа String,
заполненный согласно условию задачи.*/
package javarush.string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenString {

    public static void main(String[] args) {

        String packagePath = "iAm/A/spyware/one";


        String[] tokens = getTokens(packagePath, "/");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        String[] strings = new String[st.countTokens()];
        while (st.hasMoreTokens()) {
            for (int i = 0; i < strings.length; i++) {
                strings[i] = st.nextToken();
            }
        }

        return strings;
    }
}