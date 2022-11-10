/*Второе минимальное число из введенных
В этой задаче нужно: 1. Считывать целые числа с клавиатуры до тех пор,
пока не будет введено что-то другое: например, строка или символ.
Должно быть введено минимум два числа. Если введено меньше, то такую ситуацию
обрабатывать не нужно, а программа может быть завершена с ошибкой. 2. Вывести*/
package javarush.solution;


import java.util.Scanner;

class Min2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner("88 44 22 11 0 -9 -100");
        int min = Integer.MAX_VALUE;
        int temp = Integer.MAX_VALUE;

        while (scan.hasNextInt()){
            int x = scan.nextInt();
            temp = min;
            if (x < min){
                min = x;
            }
        }
//        System.out.println(min);
        System.out.println(temp);



    }
}