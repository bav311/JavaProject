package javarush.solution;
public class ChessBoard {
    public static String chessBoardCord(int a, int b) {
        String letters = "abcdefgh";
        String numbers = "87654321";
        if ((a > 7)|| (b>7)) return null; //если номер за пределами доски, возвращаем значение по умолчанию - null
        else return (Character.toString(letters.charAt(a)) + numbers.charAt(b));
        /*charAt - метод, с помощью которого мы извлекаем из строки элемент под переданным номером,
        здесь - под номерами a и b. Character.toString - метод, который переводит полученный символ
        в строку*/
    }
    public static void printArray(String[][] chessBoard) {
        for (String[] strings : chessBoard) {
            for (String string : strings) {
                System.out.print(string + "\t");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if ((i+j) %2 ==0) {
                    chessBoard[i][j] = "W" + chessBoardCord(j,i);
                } else chessBoard[i][j] = "B" + chessBoardCord(j,i);
            }
        }

        printArray(chessBoard);


    }


}