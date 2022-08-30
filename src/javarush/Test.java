/*Замок чернобайта. Создай метод String destroyDeadMan(String), который будет принимать
на вход "имя" мертвеца и возвращать фразу "<имя> был уничтожен",
где <имя> — значение аргумента метода destroyDeadMan.
В методе main вызови метод destroyDeadMan(String) для каждого мертвеца из списка deadMen,
результат вызова выведи на экран.*/

package javarush;


public class Test {
    public static String[] deadMen = {"мертвец_1", "мертвец_2", "мертвец_3", "мертвец_4", "мертвец_5",
            "мертвец_6", "мертвец_7", "мертвец_8"};

    public static void main(String[] args) {

        for (int i = 0; i < deadMen.length; i++) {
            System.out.println(deadMen[i]);

        }

    }

     public static String destroyDeadMan(String name) {
        name = "destroyd";
         for (int i = 0; i < deadMen.length; i++) {
         deadMen[i] = deadMen[i] + name;
         }
        return name;
    }
}