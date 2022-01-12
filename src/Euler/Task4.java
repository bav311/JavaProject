/*
Число-палиндром с обеих сторон (справа налево и слева направо) читается одинаково.
Самое большое число-палиндром, полученное умножением двух двузначных чисел – 9009 = 91 × 99.
Найдите самый большой палиндром, полученный умножением двух трехзначных чисел.
*/

package Euler;

public class Task4 {
    public static void main(String[] args) {
        int largestnum = 0;
        Task4 pp = new Task4();

        for (int i = 10; i <= 99; i++) {
            for (int k = 10; k <= 99; k++) {
                if (pp.checkPal(i * k) == true) {
                    System.out.println((largestnum = i * k) + " " + i + " " + k);
                }
            }
        }

        System.out.println(largestnum);
    }


    public boolean checkPal(int y) {
        String snum = Integer.toString(y);
        int snum_length = snum.length() - 1;
        String palindrome = new String("");

        for (int i = snum_length; i >= 0; i--) {
            palindrome = palindrome.concat(Character.toString(snum.charAt(i)));
        }

        if (snum.equals(palindrome)) {
            return true;
        } else {
            return false;
        }

    }
}