package temp;


import java.util.Scanner;

class Temp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input start number");
        int start = scan.nextInt();
        System.out.println("Input end number");
        int end = scan.nextInt();
        System.out.println("Input multiple number");
        int multiple = scan.nextInt();
        int sum = 0;
        for (int i = start; i < end ; i++) {
            if (i % multiple != 0) {
                continue;
            }
            sum += i ;

        }
        System.out.println(sum);
    }

}