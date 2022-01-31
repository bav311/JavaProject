/*Напишем программу, в которой нужно вводить с клавиатуры целые числа
        и считать их сумму, пока пользователь не введет слово "ENTER".
        Вывести на экран полученную сумму и завершить программу.*/
package temp;

import java.util.Scanner;

class SumNumberExit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        boolean isExit = false;

        while (!isExit) {
            String str = scan.nextLine();
            if (str.equals("e")) {
                isExit = true;
            } else {
                int x = Integer.parseInt(str);
                sum += x;
            }
        }
        System.out.println(sum);

    }
}