package andrew;

public class SumDigitsInNumber {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));

    }

    public SumDigitsInNumber() {
    }

    public static int sumDigitsInNumber(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

