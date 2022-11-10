package javarush.solution;
public class ArrayPrint {

    public ArrayPrint(int[][] mas) {
        for (int[] ma : mas) {
            for (int i : ma) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
