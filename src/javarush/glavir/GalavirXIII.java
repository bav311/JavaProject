/*Нужно победить главный корабль армии галаксианских багов "Галавир XIII"
находящийся на орбите Айтинии. Главный корабль обладает супер-оружием,
системой защиты и системой атаки, а также показателем запаса прочности.

Создай класс GalavirXIII. Добавь публичную статическую переменную
супер-оружия superWeapon типа int со значением Integer.MAX_VALUE и
публичную переменную запаса прочности корабля health типа double со значением Double.MAX_VALUE.

Система защиты будет реализована в публичном void методе defend(double)
с одним параметром типа double следующим образом:
запас прочности корабля (health) уменьшается на результат деления
значения супер-оружия (superWeapon) на значение входящего параметра.
+++++++++++++++++++++++++++
А система атаки будет реализована в публичном методе attack(),
который будет возвращать силу атаки, то есть значение супер-оружия (superWeapon).
Требования:
Создай класс GalavirXIII.
В классе GalavirXIII необходимо создать публичную статическую переменную
superWeapon со значением Integer.MAX_VALUE.

В классе GalavirXIII необходимо создать публичную переменную health
типа double со значением Double.MAX_VALUE.

В классе GalavirXIII необходимо создать публичный
void метод defend(double) согласно условия.

В классе GalavirXIII необходимо создать публичный метод attack(),
который возвращает значение статической переменной superWeapon.*/

package javarush.glavir;

public class GalavirXIII {
//    public static int superWeapon = Integer.MAX_VALUE;
//public double health = Double.MAX_VALUE;
public double health = 1_000_000;
    public static int superWeapon = 200_000;

    public void defend(double def) {
        health -= superWeapon/def;
    }

    public int attack() {
        return superWeapon;
    }

    public static void main(String[] args) {
        System.out.println(superWeapon);
    }
}