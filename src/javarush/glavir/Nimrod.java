package javarush.glavir;

public class Nimrod {
    public static int laser = 100_000;
    public static int rocket = 10_000;
    public static int angelicaKiss;
    public int health = 1_000_000;

    public int attack(){
        return rocket;
    }

    public void defend(int damage) {
        health -= damage;
    }
}
