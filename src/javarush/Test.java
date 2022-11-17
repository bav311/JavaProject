package javarush;


public class Test {

    public static void main(String[] args) {
             String path = "https://domen.ru/about/reviews";

        int index = path.indexOf("//");
        int index2 = path.indexOf("/", index + 2);

        String first = path.substring(0,index +2);
        String last = path.substring(index2);

        String result = first + "javarush.ru" + last;
        System.out.println(result);
        System.out.println(first);
        System.out.println(last);


    }
}


