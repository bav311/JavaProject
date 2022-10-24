/*Публичный статический метод toOctal(int) должен переводить целое число,
полученное в качестве входящего параметра, из десятичной системы счисления в восьмеричную.
А публичный статический метод toDecimal(int) наоборот — из восьмеричной в десятичную.
Методы работают только с положительными числами. Если входящий параметр меньше или равен 0,
методы возвращают 0.
Твоя задача — реализовать эти методы.

Один из алгоритмов перевода десятичного числа в восьмеричное следующий:
i равно 0
while(десятичное число не равно 0) {
восьмеричное число = восьмеричное число + (остаток от деления десятичного числа на 8) * на 10 в степени i
десятичное число = десятичное число / 8
i увеличиваем на 1
}

Один из алгоритмов перевода восьмеричного числа в десятичное следующий:
i равно 0
while(восьмеричное число не равно 0) {
десятичное число = десятичное число + (остаток от деления восьмеричного числа на 10) * на 8 в степени i
восьмеричное число = восьмеричное число / 10
i увеличиваем на 1
}

Метод main() не принимает участие в тестировании.

Подсказка: чтобы возвести число в степень, можно использовать метод Math.pow(число, степень).

Требования:
Нужно чтобы метод toOctal(int) был реализован согласно условию.
Нужно чтобы метод toDecimal(int) был реализован согласно условию.
Методы Integer.toOctalString(int) и Long.toOctalString(int) использовать нельзя.
Методы Integer.parseInt(String, int) и Long.parseLong(String, int) использовать нельзя.
Методы Integer.toString(int, int) и Long.toString(long, int) использовать нельзя.
Объект типа BigInteger использовать нельзя.
Объект типа BigDecimal использовать нельзя.*/


package javarush;

public class Temp {
    public static void main(String[] args) {



    }
}