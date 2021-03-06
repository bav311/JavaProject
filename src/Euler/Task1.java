/*
Если выписать все натуральные числа меньше 10, кратные 3 или 5, то получим 3, 5, 6 и 9.
Сумма этих чисел равна 23.
Найдите сумму всех чисел меньше 1000, кратных 3 или 5.
*/

package Euler;

public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println();
        System.out.println(sum);

    }
}
