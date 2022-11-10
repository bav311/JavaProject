/*Замок чернобайта. Создай метод String destroyDeadMan(String), который будет принимать
на вход "имя" мертвеца и возвращать фразу "<имя> был уничтожен",
где <имя> — значение аргумента метода destroyDeadMan.
В методе main вызови метод destroyDeadMan(String) для каждого мертвеца из списка deadMen,
результат вызова выведи на экран.*/

package javarush.solution;


public class Castle {
    public static String[] deadMen = {"мертвец_1", "мертвец_2", "мертвец_3", "мертвец_4", "мертвец_5",
            "мертвец_6", "мертвец_7", "мертвец_8"};

    public static void main(String[] args) {
        for (String str : deadMen) {
            System.out.println(destroyDeadMan(str));
        }
    }


    public static String destroyDeadMan(String str) {
        str = str + " был уничтожен";
        return str;

    }
}