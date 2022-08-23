package temp;

import java.util.Arrays;

class Temp {
    public static void main(String[] args) {
        int[] arrays = new int[11];
        int valueStart = 8;
        int valueEnd = 1;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays.length % 2 == 0){
                Arrays.fill(arrays,0,arrays.length/2,valueStart);
                Arrays.fill(arrays,arrays.length/2,arrays.length,valueEnd);
            } else {
                Arrays.fill(arrays,0,arrays.length/2+1,valueStart);
                Arrays.fill(arrays,arrays.length/2+1,arrays.length,valueEnd);
            }

        }

        System.out.println(Arrays.toString(arrays));


    }
}