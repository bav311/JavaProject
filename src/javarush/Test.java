/*Создай метод switchSword(String) с параметром типа String,
который будет выводить фразу "Меч переключен в <параметр> режим.",
где <параметр> — значение аргумента метода switchSword.
Вызови метод switchSword() с нужным параметром и в нужном месте метода main.
Остальной код метода main не изменяй.*/

package javarush;

import java.util.Arrays;

public class Test {
    public static void fill(int[] data, int from, int to, int value)
    {
        if (from < 0 || to > data.length)
            return;

        for (int i = from; i < to; i++)
        {
            data[i] = value;
        }
    }

    public static void main(String[] args)
    {
        int[] months = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10, 11, 12};
        System.out.println(Arrays.toString(months));
        fill(months, 2, 12, 8);
        System.out.println(Arrays.toString(months));
    }
}