package javarush.test;

public class Main {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();

    }
    public static String print (String text){
        System.out.println(text);
        return text;
    }
}

//Так что вы всегда лично можете убедиться,
// что переменные класса инициализируются до вызова его конструктора.
// Вся инициализация базового класса идет до инициализации класса-наследника.