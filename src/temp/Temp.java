package temp;

public class Temp {
    public static void main(String[] args) {
        int n = 100;
        int []arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (Math.random() * (20+1)-10); // -10 +10
        }

        for (int i:arr) {
            System.out.print(i + " ");

        }
    }
}