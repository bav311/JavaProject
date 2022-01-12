/*
Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих.
Начиная с 1 и 2, первые 10 элементов будут:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
Найдите сумму всех четных элементов ряда Фибоначчи, которые не превышают четыре миллиона.
*/
package Euler;

public class Task2 {
    public static void main(String[] args) {
        int current = 0;
        int previous = 1;
        int early = 0;
        int summa = 0;
        long start = System.currentTimeMillis();
        while (current < 4_000_000) {
            current = previous + early;
            early = previous;
            previous = current;
            if (current % 2 == 0) {
                System.out.print(current + " ");
                summa += current;
            }
        }
        System.out.println();
        System.out.println(summa);
        long end = System.currentTimeMillis();
        long totalTime = end - start;
        System.out.println("Время выполнения : " + totalTime + " миллисекунд");


    }
}