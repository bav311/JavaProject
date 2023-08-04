package javarush;

public class One {

    public static void main(String[] args) {
        Two two = new Two(2,1);
        two.setX(8);
        two.setY(9);
        System.out.println(two.mulply(two.getX(), two.getY()));




        }
}