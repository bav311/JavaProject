/*
Простые делители числа 13195 - это 5, 7, 13 и 29.
Каков самый большой делитель числа 600851475143, являющийся простым числом?
*/
package Euler;
public class Task3 {
    public static void main(String[] args) {
        long largestPrime = 0;
        long x = 13195L;
        for (long j = 3; j * j <= x; j += 2) {
            if (x % j == 0 && j > largestPrime && isPrimeOptimized(j)) {
                largestPrime = j;
                System.out.print(j + " ");
            }
        }
        System.out.println("Наибольший, простой делитель числа: " + x + " - " + largestPrime);
        System.out.println();

        System.out.println("simpl number:");

        for (long i = 3; i < 300; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrimeOptimized(long number) {
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

    public static boolean isPrime(long number) {
        for (long i = 3; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}