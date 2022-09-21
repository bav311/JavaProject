/*В этой части предстоит большое сражение.
В классе BattleField есть статические переменные типа String,
они будут использоваться для отображения хода битвы.

Метод isNimrodAlive(Nimrod) проверяет, выдержал ли корабль
"Нимрод" атаку корабля "Галавир XIII". Если выдержал, то в консоль выводится,
что вражеская атака отбита (переменная nimrodDefence).
Если не выдержал, то в консоль выводится,
что вражеский удар не выдержан (переменная nimrodDestroy).

Метод isGalavirAlive(GalavirXIII) проверяет выдержал ли корабль "Галавир XIII"
атаку корабля "Нимрод". Если выдержал, то в консоль выводится,
что наша атака успешно отражена врагом (переменная galavirDefence).
 Если не выдержал, то в консоль выводится, что вражеский корабль повержен (переменная galavirDestroy).

В методе main() класса BattleField нужно создать по одному объекту классов GalavirXIII и Nimrod.
Первым всегда атакует враг, поэтому нужно вывести в консоль,
что враг наносит удар (переменная galavirAttack).


Кораблю "Нимрод" нужно активировать систему защиты, вызвав метод defend(int)
у объекта типа Nimrod и передав в метод результат вызова метода attack() объекта типа GalavirXIII.


Сражение происходит до тех пор, пока корабль "Нимрод" не будет разрушен.
Поскольку в начале битвы корабль в полной боевой готовности и сначала
нужно пережить вражескую атаку, то правильно будет использовать цикл do-while.

P. S. К сожалению, в этой части корабль "Нимрод" не может пережить атаку корабля "Галавир XIII".
В следующей части мы это исправим.

Требования:
В методе main() нужно создать один объект типа GalavirXIII.
В методе main() нужно создать один объект типа Nimrod.
В методе main() нужно использовать цикл do-while.
Перед вызовом метода attack() объекта типа GalavirXIII,
нужно выводить в консоль значение переменной galavirAttack.

У объекта типа GalavirXIII нужно вызвать метод attack().
Результат вызова метода attack() объекта типа GalavirXIII передать
в метод defend(int) объекта типа Nimrod.

*/

package javarush.glavir;

public class BattleField {
    public static String nimrodDefence = "Вражеская атака отбита";
    public static String nimrodAttack = "Наносим контр удар";
    public static String nimrodDestroy = "Вражеский удар не выдержан";
    public static String galavirDefence = "Наша атака успешно отражена врагом";
    public static String galavirAttack = "Враг наносит удар";
    public static String galavirDestroy = "Вражеский корабль повержен";

    public static void main(String[] args) {
        GalavirXIII galavir = new GalavirXIII();
        Nimrod nimrod = new Nimrod();
        do {
            System.out.println(galavirAttack);
            nimrod.defend(galavir.attack());
            if (isNimrodAlive(nimrod)) {
                System.out.println(nimrodAttack);
                System.out.println("galavir = " + galavir.health);
                if (isGalavirAlive(galavir)) {
                    System.out.println(galavirAttack);
                }
            } else {
                galavir.defend(nimrod.attack());
                System.out.println("nimrod = " + nimrod.health);
            }
        } while (galavir.health >= 0);

    }

    public static boolean isNimrodAlive(Nimrod nimrod) {
        if (nimrod.health > 0) {
            System.out.println(nimrodDefence);
            return true;
        } else {
            System.out.println(nimrodDestroy);
            return false;
        }
    }

    public static boolean isGalavirAlive(GalavirXIII galavir) {
        if (galavir.health > 0) {
            System.out.println(galavirDefence);
            return true;
        } else {
            System.out.println(galavirDestroy);
            return false;
        }
    }
}