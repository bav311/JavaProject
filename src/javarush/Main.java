/*
Минимальный элемент массива
В этой задаче тебе нужно:

Считать 10 чисел с консоли и заполнить ими массив с помощью метода getArrayOfTenElements().
Найти минимальный элемент массива и вернуть этот элемент с помощью метода min(int[]).
В методе min(int[]) обязательно используй метод Math.min(int, int).

Requirements:
1. Программа должна считывать числа с клавиатуры.
2. Класс Solution должен содержать только три метода.
3. Метод getArrayOfTenElements() должен считать с клавиатуры 10 чисел, потом вернуть массив размером 10 элементов, заполненный считанными числами.
4. Метод min(int[]) должен вернуть минимальный элемент массива, используя метод min(int, int) класса Math.
5. Метод main() должен вызывать метод getArrayOfTenElements().
6. Метод main() должен вызывать метод min(int[]).
*/
package javarush;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(Arrays.toString(intArray));
        System.out.println(min(intArray));


    }

    public static int[] getArrayOfTenElements() {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static int min(int[] getArray) {
        int min = getArray[0];
        for (int i = 1; i < getArray.length; i++) {
         min = Math.min(min, getArray[i]);
        }

        return min;
    }

}