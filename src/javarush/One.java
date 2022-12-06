/*https://javarush.com/help/85733*/

/*В блоки управления пиратов (массив controlUnits) проникли вирусы и баги.
Требуется почистить эти блоки, чтобы помочь пиратам.

С этой задачей нам помогут два метода в классе Solution:
splitArrayElements и getStringFromArray.

В методе splitArrayElements требуется пройтись по массиву controlUnits и
с помощью StringTokenizer разбить элементы таким образом,
чтобы массив изменился на пять следующих строк: "one", "two", "three", "four" и "five".

Затем в методе getStringFromArray требуется пройтись по массиву controlUnits и
с помощью String.format() отформатировать каждый его элемент таким образом,
чтобы элементы массива изменились на следующие:

"Block one back online."
"Block two back online."
"Block three back online."
"Block four back online."
"Block five back online."
Метод main не участвует в проверке.

Требования:
Не изменяй изначальные значения массива controlUnits в классе Solution.
Метод splitArrayElements должен изменять элементы массива controlUnits согласно условиям.
Метод getStringFromArray должен изменять элементы массива controlUnits согласно условиям.*/

package javarush;

import java.util.StringTokenizer;

public class One {
    public static String[] controlUnits = {"iAm/A/spyware/one", "iAm/A/malware/two", "iAm/A/virus/three", "iAm/A/trojan/four", "iAm/bug/five"};

    public static void main(String[] args) {
//        splitArrayElements();
//        getStringFromArray();
        print(controlUnits);

    }

    public static String[] outStrings(String[] inStrings) {
        StringTokenizer tokenizer = new StringTokenizer("fsdf", "\\.");

        return null;
    }

    public static void print(String[] array) {
        for (String a : array) {
            System.out.println(a);
        }
    }
}