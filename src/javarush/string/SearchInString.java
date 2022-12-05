/*
Метод getIndexFromFirstWord(String, String) и метод getIndexFromLastWord(String, String) принимают строку и слово.
Нужно, чтобы метод getIndexFromFirstWord(String, String) вернул индекс первого символа первого слова (второй параметр метода) в строке (первый параметр метода). А метод getIndexFromLastWord(String, String) вернул индекс первого символа последнего слова (второй параметр метода) в строке (первый параметр метода).

Пример:
строка — "Чтобы стать программистом, нужно писать код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание."
слово — "код"

метод getIndexFromFirstWord(строка, слово) должен вернуть 40
метод getIndexFromLastWord(строка, слово) должен вернуть 58
Метод main() не принимает участия в тестировании.

Требования:
Нужно вывести на экран индекс первого символа первого слова (второй параметр метода) в строке (первый параметр метода).
Нужно вывести на экран индекс первого символа последнего слова (второй параметр метода) в строке (первый параметр метода).
*/

package javarush.string;


public class SearchInString {
    public static void main(String[] args) {
        String string = "Чтобы стать программистом, нужно писать код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание.";
        String word = "код";

        System.out.println(getIndexFromFirstWord(string,word));
        System.out.println(getIndexFromLastWord(string,word));

    }


    public static int getIndexFromFirstWord(String inComingString, String inComigWord) {
        return inComingString.indexOf(inComigWord);
    }

    public static int getIndexFromLastWord(String inS, String inW) {
        return inS.lastIndexOf(inW);
    }
}


