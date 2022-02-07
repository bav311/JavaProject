package temp;

public class Temp {
    public static int[][][][][] multiArray = new int[2][3][4][2][3];

    public static void main(String[] args) {
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    for (int l = 0; l < multiArray[i][j][k].length; l++) {
                        for (int m = 0; m < multiArray[i][j][k][l].length; m++) {
                            System.out.print(multiArray[i][j][k][l][m] + " ");
                        }

                        System.out.println();
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
