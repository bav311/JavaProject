/*Публичный статический метод toOctal(int) должен переводить целое число,
полученное в качестве входящего параметра, из десятичной системы счисления в восьмеричную.
А публичный статический метод toDecimal(int) наоборот — из восьмеричной в десятичную.
Методы работают только с положительными числами. Если входящий параметр меньше или равен 0,
методы возвращают 0.
*/


package javarush;

public class SystemNumber {
    public static void main(String[] args) {
        int dNumber = 21;
        int oNumber = 25;
        int bNumber = 10101;
        System.out.println("Десятичное число " + dNumber + " равно восьмеричному числу " + toOctal8(dNumber));
        System.out.println("Восьмеричное число " + oNumber + " равно десятичному числу " + toDecimal8(oNumber));
        System.out.println("Десятичное число " + dNumber + " равно двоичному числу " + toBinary2(dNumber));
        System.out.println("Двоичное число " + bNumber + " равно десятичному числу " + toDecimal2(bNumber));
    }
    public static int toOctal8(int decimalNumber) {
        if (decimalNumber < 0) {
            return 0;
        }
        int octalNumber = 0;
        int i = 0;
        while (decimalNumber != 0) {
            int pow = (int) Math.pow(10, i);
            octalNumber += decimalNumber % 8 * pow;
            decimalNumber /= 8;
            i++;
        }
        return octalNumber;
    }
    public static int toDecimal8(int octalNumber) {
        if (octalNumber < 0) {
            return 0;
        }
        int decimalNumber = 0;
        int i = 0;
        while (octalNumber != 0) {
            int pow = (int) Math.pow(8, i);
            decimalNumber += octalNumber % 10 * pow;
            octalNumber /= 10;
            i++;
        }
        return decimalNumber;
    }
    public static int toBinary2(int decimalNumber) {
        if (decimalNumber < 0) {
            return 0;
        }
        int binaryNumber = 0;
        int i = 0;
        while (decimalNumber != 0) {
            int pow = (int) Math.pow(10, i);
            binaryNumber += decimalNumber % 2 * pow;
            decimalNumber /= 2;
            i++;
        }
        return binaryNumber;
    }
    public static int toDecimal2(int binaryNumber) {
        if (binaryNumber < 0) {
            return 0;
        }
        int decimalNumber = 0;
        int i = 0;
        while (binaryNumber != 0) {
            int pow = (int) Math.pow(2, i);
            decimalNumber = decimalNumber + (binaryNumber % 10) * pow;
            binaryNumber = binaryNumber / 10;
            i++;
        }
        return decimalNumber;
       }
}
