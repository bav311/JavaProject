package temp;

class Temp {
    public static void main(String[] args) {
        int[][] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i + 1) * (j +1);
            }
        }

        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++)
                System.out.print(table[i][j] + "\t");
            System.out.println();
        }

        }

    }