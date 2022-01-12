package Milkina.Lesson5Video;

public class Array {
    public static void main(String[] args) {
//        1 version
        String[] day = new String[7];
        day[0] = "Mon";
        day[1] = "Tue";
        day[2] = "Wed";
        day[3] = "Thu";
        day[4] = "Fri";
        day[5] = "Sat";
        day[6] = "Sun";
        for (String i : day) {
            System.out.print(i + " ");
        }
        System.out.println("\t");
//        2 version
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31};
//        замена массива
        month = new int [] {1, 11, 111};

        for (int element : month) {
            System.out.print(element + " ");
        }

        System.out.println("\t");
//        3 version
        print(new int[]{8, 9, 5});

    }
    public static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
