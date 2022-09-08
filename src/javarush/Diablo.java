package javarush;

import java.util.Scanner;

public class Diablo {
    public static String getFirstPositionPhrase = "Помоги Амиго определить, где спрятался Диабло? Введи номер позиции (1, 2, 3 или 4):";
    public static String getPositionPhrase = "Диабло не обнаружен. Давай попробуем снова. Введи номер позиции (1, 2, 3 или 4):";
    public static String findDiabloPhrase = "Амиго обнаружил Диабло.";
    public static String diabloDefendPhrase = "Амиго атакует. Диабло отбил атаку Амиго и нанес ответный удар.";
    public static String amigoAttackPhrase = "Удар Амиго достиг цели. Диабло потерял 3 жизни.";
    public static String winPhrase = "Амиго одержал победу над Диабло и выбил из его головы загадочный кристалл.";
    public static String loosePhrase = "Диабло победил Амиго.";
    public static int diabloPosition;
    public static int amigoLives = 9;
    public static int diabloLives = 9;

    public static void main(String[] args) {
        diabloPosition = getRandomNumber(1);
        findDiablo();
        battle();
        if (isAmigoWin()){
            System.out.println(winPhrase);
        } else {
            System.out.println(loosePhrase);
        }
        System.out.println(amigoLives);
        System.out.println(diabloLives);
    }

    public static void amigoLostLife() {
        amigoLives -= 3;
    }

    public static void diabloLostLife() {
        diabloLives -= 3;
    }

    public static int amigoAttacks() {
        return getRandomNumber(3);
    }

    public static int diabloAttacks() {
        return (getRandomNumber(3));
    }

    public static int diabloDefends() {
        diabloAttacks();
        return getRandomNumber(3);
    }

    public static void findDiablo() {
        System.out.println(getFirstPositionPhrase);
        Scanner scan = new Scanner(System.in);
        while (true) {
            int position = scan.nextInt();
            if (position == diabloPosition) {
                System.out.println(findDiabloPhrase);
                break;
            } else {
                System.out.println(getPositionPhrase);
            }
        }
    }

    public static void battle() {
        while ((amigoLives >= 0) | (diabloLives >= 0)) {
            if (amigoAttacks() == diabloDefends()) {
                diabloAttacks();
                amigoLostLife();
                System.out.println(diabloDefendPhrase);
                if (amigoLives == 0) {
//                    System.out.println(loosePhrase);
                    break;
                }
            } else {
                diabloLostLife();
                System.out.println(amigoAttackPhrase);
                if (diabloLives == 0) {
//                    System.out.println(winPhrase);
                    break;
                }
            }
        }
    }

    public static boolean isAmigoWin() {
        return amigoLives > 0;
    }

    public static int getRandomNumber(int range) {
        return (int) (Math.random() * range) + 1;
    }
}
