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

package javarush.string;

import java.util.StringTokenizer;

public class PirateLiberation {
    public static String[] controlUnits = {"iAm/A/spyware/one", "iAm/A/malware/two", "iAm/A/virus/three", "iAm/A/trojan/four", "iAm/bug/five"};

    public static void main(String[] args) {
        splitArrayElements(controlUnits);
        getStringFromArray(controlUnits);
        print(controlUnits);

    }

    public static void splitArrayElements(String[] inStrings) {
        for (int i = 0; i < inStrings.length; i++) {
            StringTokenizer tokenizer = new StringTokenizer(inStrings[i], "/");
            while (tokenizer.hasMoreTokens()) {
                inStrings[i] = tokenizer.nextToken();
            }
        }
    }

    public static void getStringFromArray(String[] inStrings) {
        for (int i = 0; i < inStrings.length; i++) {
            inStrings[i] = String.format("Block %s back online.",inStrings[i]);

        }
    }

    public static void print(String[] array) {
        for (String a : array) {
            System.out.println(a);
        }
    }
}