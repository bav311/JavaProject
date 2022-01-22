package temp;

public class Temp {
    public static void main(String[] args) {
        int n = 100;
        int []arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (Math.random() * (200+1)-100); // -100 +100
        }

        for (int i:arr) {
            System.out.print(i + " ");

        }
    }
}