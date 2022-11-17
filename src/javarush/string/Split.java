package javarush.string;

public class Split {
    public static void main(String[] args) {
        String str = "I love Java";
        String[] word = str.split(" ");
        for (String a : word) {
            System.out.println(a);
        }
        System.out.println();
        print("Вариации работы метода".split(" "));
        print("Вариации работы метода ".split(" "));
        print(" Вариации работы метода".split(" "));
        print(" Вариации работы метода ".split(" "));
        System.out.println("++++++++++++++++++++++++++++++++++");
        print(" Вариации работы метода ".split(" ", 1));
        System.out.println("------------------------------1");
        print(" Вариации работы метода ".split(" ", -2));
        System.out.println("------------------------------2");
        print(" Вариации работы метода ".split(" ", 0));
        System.out.println("++++++++++++++++++++++++++++++++++++");
        String userInfo = "135|bender|bender@gmail.com";
        System.out.println(getEmailAdress(userInfo));

        System.out.println("************************************");
        String orderInfo = "1,огурцы,20.05; 2,помидоры,123.45; 3,зайцы,0.50";
        System.out.println("Сумма равна " +getTotalOrderAmount(orderInfo));

    }

    static String getEmailAdress(String data) {
        String[] arr = data.split("\\|");
        return arr[arr.length - 1];
    }


    public static void print(String[] array) {
//        System.out.println(Arrays.toString(array));
        for (String ar : array) {
            System.out.println(ar);
        }
    }

    public static double getTotalOrderAmount(String inComingText) {
        double total = 0d;
        String[] array = inComingText.split(";");

        for (String item:array) {
            String[] newArray = item.split(",");
            total += Double.parseDouble(newArray[newArray.length-1]);

        }

        return total;
    }
}
