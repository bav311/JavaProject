/*Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10],
заполни его таблицей умножения и выведи в консоли в следующем виде:
 1 2 3 4 … 2 4 6 8 … 3 6 9 12 … 4 8 12 16 …
… Числа в строке разделены пробелом.*/
package javarush;

class Level05lec04 {
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