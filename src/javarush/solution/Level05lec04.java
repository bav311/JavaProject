/*{"Hello", "Hello", "World", "Java", "Tasks", "World"} */
package javarush.solution;

class Level05lec04 {
    public static void main(String[] args) {
        int[][] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i + 1) * (j +1);
            }
        }

        for (int[] ints : table) {
            for (int anInt : ints) System.out.print(anInt + "\t");
            System.out.println();
        }

        }

    }