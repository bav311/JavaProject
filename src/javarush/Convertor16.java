package javarush;

public class Convertor16 {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1973;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String hexNumber = "";
        if (decimalNumber <= 0) {
            return hexNumber;
        }
        while (decimalNumber != 0) {
            int index = decimalNumber % 16;
            char ch = HEX.charAt(index);
            hexNumber = ch + hexNumber;
            decimalNumber = decimalNumber / 16;
        }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        int decimalNumber = 0;
        if(hexNumber == null || hexNumber == ""){
            return decimalNumber;
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            char fromString = hexNumber.charAt(i);
            int index = HEX.indexOf(fromString);
            decimalNumber = 16 * decimalNumber + index;
        }
        return decimalNumber;
    }
}