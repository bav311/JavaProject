/*Эта задача нужна для понимания того, как вызывается конструктор базового класса (родителя).
У тебя есть классы ElectricCar, GasCar, HybridCar, которые наследуют класс Car.
Тебе нужно в конструкторах наследников класса Car передать тип автомобиля
в конструктор базового класса (родителя),
используя super("тип автомобиля").
Для этого в классе Solution в методе main создай 3 объекта: HybridCar, GasCar и ElectricCar.

Вывод должен быть следующий (последовательность может быть любая):
Привет. Я ElectricCar
Привет. Я GasCar
Привет. Я HybridCar

Требования:
Классы ElectricCar, GasCar, HybridCar должны наследоваться от класса Car.
Тело конструктора класса Car не изменяй.
Наследники класса Car должны вызывать конструктор базового класса с соответствующим аргументом.
В методе main должно быть создано 3 объекта классов HybridCar, GasCar и ElectricCar.
Вывод должен соответствовать условию.*/
package javarush.test1002_1;

public class Solution {
    public static void main(String[] args) {
//        ElectricCar electricCar = new ElectricCar();
//        GasCar gasCar = new GasCar();
//        HybridCar hybridCar = new HybridCar();
        new ElectricCar();
        new GasCar();
        new HybridCar();
    }
}

//https://javarush.com/groups/posts/1187-raznica-mezhdu-kljuchevihmi-slovami-this-i-super-v-java
