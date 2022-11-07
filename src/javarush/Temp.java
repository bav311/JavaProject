package javarush;

public class Temp {
    private static final String HEX = "0123456789ABCDEF";

    public static void main(String[] args) {
        int decimalNumber = 1973;
        String hexNumber = "7B5";
        System.out.println(decimalNumber + " = " + toHex(decimalNumber));

        System.out.println(toDecimal(hexNumber));


    }

    public static String toHex(int decimalNumber) {
        String nextNumber = "";
        if (decimalNumber < 0) {
            return nextNumber;
        }
        while (decimalNumber != 0) {
            int i = decimalNumber % 16;
            char ch = HEX.charAt(i);
            nextNumber = ch + nextNumber;
            decimalNumber /= 16;
        }
        return nextNumber;
    }


    public static int toDecimal (String hexNumber) {
        int decimalNumber = 0;
        if (hexNumber == null || hexNumber.equals("")) {
            return decimalNumber;
        }

        for (int i = 0; i < hexNumber.length(); i++) {
            char fromNexNumber = hexNumber.charAt(i);
            int index = HEX.indexOf(fromNexNumber);
            decimalNumber = 16 * decimalNumber + index;
        }
        return decimalNumber;
    }


}