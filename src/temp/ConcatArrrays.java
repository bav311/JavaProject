//firstArray и secondArray в один массив resultArray
package temp;
import java.util.Arrays;

class ConcatArrrays {
    public static void main(String[] args) {


        int[] firstArray = {44, 55, 66, 77, 88};
        int[] secondArray = {1, 2, 3, 4, 5, 6};

        int[] resultArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < resultArray.length - secondArray.length; i++) {
            resultArray[i] = firstArray[i];
        }
        for (int j = 0; j < resultArray.length - firstArray.length; j++) {
            resultArray[j + firstArray.length] = secondArray[j];

        }


        System.out.println(Arrays.toString(resultArray));


    }

}