/*
Простые делители числа 13195 - это 5, 7, 13 и 29.
Каков самый большой делитель числа 600851475143, являющийся простым числом?
*/
package Euler;

import java.time.Duration;
import java.time.LocalTime;

public class Task3_1 {
    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.now();
        long largestPrime = 0;
        long x = 13_195;
        for (long j = 3; j <= x / 2; j = j + 2) {
            if (x % j == 0 & j > largestPrime & isPrimeOptimized(j)) {
                largestPrime = j;
                System.out.print(j + " ");
            }
        }
        System.out.println();
        System.out.println("Наибольший, простой делитель числа: " + x + " - " + largestPrime);
        LocalTime localTime2 = LocalTime.now();
        Duration duration1 = Duration.between(localTime1, localTime2);
        System.out.println("время выполнения - " + duration1);

        LocalTime localTime3 = LocalTime.now();
        for (long i = 3; i < 300; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        LocalTime localTime4 = LocalTime.now();
        Duration duration2 = Duration.between(localTime3, localTime4);
        System.out.println();
        System.out.println("время выполнения - " + duration2);
    }

    private static boolean isPrimeOptimized(long number) {
        if (number < 2) {
            return false;
        }
        if (number % 2 == 0) {
            return number == 2;
        }
        if (number % 3 == 0) {
            return number == 3;
        }
        for (int i = 5; i * i < number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime(long number) {
        for (long i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}