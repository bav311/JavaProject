/*Иногда необходимо заполнить какую-то часть массива одинаковыми значениями
или же удалить существующие (присвоить значение null).
Реализуй для этого более гибкий метод
fillArray(Integer[] array, int value, int begin, int end),
где:
array — массив, который необходимо заполнить;
value — значение, которым необходимо заполнить;
begin — начиная с какого индекса необходимо заполнять (включительно);
end — на каком индексе остановить заполнение (исключая).
Требования:
Метод fillArray(Integer[] array, int value, int begin, int end)
должен заполнять переданный в него массив значением value.
Метод fillArray(Integer[] array, int value, int begin, int end)
должен заполнять только элементы от индекса begin(включительно) до индекса end (исключая).*/

package javarush;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        fillArray(array, 999, 5, 8);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        for (int i = begin; i < end; i++) {
            array[i] = value;
        }
    }
}