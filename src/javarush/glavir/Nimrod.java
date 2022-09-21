/*4 part
 Пришло время активировать защитный щит.
 Для этого в классе Nimrod создай публичный метод applyShield(int) с
типом возвращающего значения byte. Этот метод приводит входящий параметр типа int к типу byte.
Метод applyShield(int) нужно вызвать в методе defend(int),
передав в него полученный входящий параметр урона.
Результатом работы метода applyShield(int) будет значение,
на которое нужно уменьшать переменную запаса прочности корабля health.

Если все сделано правильно, то при вызове метода main() класса BattleField
в консоли будет видно, что корабль "Нимрод" выдерживает очень много ударов вражеского корабля.

P. S. В следующей части будем контратаковать.

Требования:
В классе Nimrod нужно создать публичный метод applyShield(int) с типом возвращающего значения byte.
Метод applyShield(int) нужно вызывать в методе defend(int), с тем же аргументом.
При вызове метода defend(int) переменная health
должна уменьшаться на значение, которое возвращает метод applyShield(int).*/


package javarush.glavir;

public class Nimrod {
    public static int laser = 300_000;
    public static int rocket = 10_000;
    public static int angelicaKiss;
    public int health = 1_000_000;

    public int attack() {
        return laser;
    }

    public void defend(int damage) {
        health -= applyShield(damage);
    }

   /* public byte applyShield(int x) {
        return (byte) x;
    }*/

    public int applyShield(int x) {
        return x;
    }
}
