package javarush;

public class One {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Good morning");
//        builder.append(" Hi ");
//        builder.append(1973);
//        builder.replace(2,5,"9999");
        builder.deleteCharAt(5);
        builder.delete(1,3);
        int x = builder.indexOf("nin");
        char a = builder.charAt(8);
        String c = builder.substring(3,6);


        String str = builder.toString();
        System.out.println(str);
        System.out.println(x);
        System.out.println(a);
        System.out.println(c);


        }
}