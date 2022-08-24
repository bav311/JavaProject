/*
Реализуй метод main(String[]), который выводит в консоль true, если элемент содержится
в переданном массиве, иначе — false.
Массив array не должен изменять расположение своих элементов.
Для поиска элемента в массиве нужен бинарный поиск. Чтобы это сделать,
используй статический метод Arrays.binarySearch(int[], int) класса Arrays.
Первым параметром нужно передать отсортированный массив, в котором выполнить
поиск, вторым параметром — искомый элемент. Метод Arrays.binarySearch(int[], int)
возвращает индекс искомого элемента, если такой элемент есть в массиве.
Для сортировки массива можно использовать метод Arrays.sort(int[]).
При тестировании значения переменных класса Solution будут разными.*/
package javarush;

public class ChessBoard {
    public static String chessBoardCoord(int a, int b) {
        String letters = "abcdefgh";
        String numbers = "87654321";
        if ((a > 7)|| (b>7)) return null; //если номер за пределами доски, возвращаем значение по умолчанию - null
        else return (Character.toString(letters.charAt(a)) + numbers.charAt(b)); /*charAt - метод, с помощью которого мы извлекаем из строки элемент под переданным номером, здесь - под номерами a и b. Character.toString - метод, который переводит полученный символ в строку*/
    }

    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if ((i+j) %2 ==0) {
                    chessBoard[i][j] = "W" + chessBoardCoord(j,i);
                } else chessBoard[i][j] = "B" + chessBoardCoord(j,i);
            }
        }

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j] + "\t");

            }
            System.out.println();
        }



    }

}