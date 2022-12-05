package javarush;

import java.util.Arrays;

public class Temp {
    public static void main(String[] args) {
        String str1 = "str";
        String str2 = new String();
        String str3 = new String(new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'l'});
        String str4 = new String(new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'l'}, 4, 5);
        String str5 = null;
        String str6 = "Основные операции со строками";
        String str7 = "Основные овперации сов стровками";
        System.out.println(str1);
        System.out.println("long line is " + str1.length());
        System.out.println(str2);
        System.out.println("long line is " + str2.length());
        System.out.println(str3);
        System.out.println("long line is " + str3.length());
        System.out.println(str4);
        System.out.println("long line is " + str4.length());
        if (str2.length() == 0) {
            System.out.println("Str2 string is empty");
        }
        if (str2.isEmpty()) {
            System.out.println("Str2 string is empty");
        }

        if (str5 == null || str5.isEmpty()) {
            System.out.println("Str5 string is empty");
        }
        System.out.println(str1.concat(str3)); // объединение строк
        System.out.println(str6);
        System.out.println(str6.charAt(5)); //возвращает символ index позиции
        char[] arrayChars = str6.toCharArray(); // создает из строки массив чаров
        // в массив символов:
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println(Arrays.toString(arrayChars));
        System.out.println(Arrays.toString(str6.getBytes())); // строка в масссив байт
        System.out.println(str6);

        Integer x = Integer.valueOf("9"); //преобразует в нужный тип данных
        Double c = Double.valueOf("5");
        Float a = Float.valueOf("80");
        Integer b = Integer.valueOf("444", 8); // преобразует в нужный тип данных
        System.out.println(x + " " + c + " " + a + " " + b);

        String[] arr1 = str6.split(""); // разделние строки split
        System.out.println(Arrays.toString(arr1));
        System.out.println("----------------------");
        char[] a1 = str6.toCharArray(); // разделние строки toCharArray
        System.out.println(Arrays.toString(a1));

        String[] arr2 = str6.split(" "); // разделние строки по пробелам
        System.out.println(Arrays.toString(arr2));

        String result = String.join("@", arr2); // объединие массива string символом @
        System.out.println(result);
        System.out.println(str6.replace("о", "()")); // замена символа
        System.out.println("///////////////////////////////////////////////////////////////////");

        int index1 = str6.indexOf(" ");
        int index2 = str6.indexOf(" ", index1 + 2);
        String first = str6.substring(0, index1);
        String second = str6.substring(index2);
        System.out.println(second.concat(first));
        System.out.println("----------------------------------------------------------");
        System.out.println(str6.repeat(5));
        System.out.println(str7);
        System.out.println(str7.replace("ов", "999"));
        System.out.println(str7.replaceAll("ов", "999"));


    }
}


