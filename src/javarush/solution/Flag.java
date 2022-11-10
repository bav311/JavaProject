/*Реализуй методы:

setFlag(int number, int flagPos) — устанавливает значение "1" биту
под индексом flagPos числа number и возвращает новое значение.
resetFlag(int number, int flagPos) — устанавливает значение "0" биту под индексом flagPos числа number и возвращает новое значение.
checkFlag(int number, int flagPos) — проверяет значение бита под индексом flagPos
числа number и возвращает true, если значение "1" и false, если "0".
Требования:
Реализуй метод setFlag(int, int) согласно условию.
Реализуй метод resetFlag(int, int) согласно условию.
Реализуй метод checkFlag(int, int) согласно условию.
a | (1 << b) install flag
a & ~(1 << b) reset flag
(a & (1 << b)) == (1 << b) check Flag

*/


package javarush.solution;

public class Flag {


    public static void main(String[] args) {
        System.out.println(setFlag(112, 2));
        System.out.println(resetFlag(116, 2));
        System.out.println(checkFlag(166, 2));
        System.out.println(checkFlag(166, 3));
    }

    public static int setFlag(int number, int flagPos) {
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        return (number & (1 << flagPos)) == (1 << flagPos);
    }
}