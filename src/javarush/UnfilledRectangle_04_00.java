/*Используя вложенные циклы while (цикл в цикле)выведи на экран
незаполненный прямоугольник (его контур)
размером 10 (высота) на 20 (ширина) из букв 'Б'.
Незаполненная часть состоит из пробелов. */
package javarush;
class UnfilledRectangle_04_00 {
    public static void main(String[] args) {
        int hei = 1;
        while (hei <= 10) {
            int len = 1;
            while (len <= 20) {
                if ((len > 1 && hei > 1) && ((len < 20 && hei < 10))) {
                    System.out.print(" ");
                } else {
                    System.out.print("Б");
                }
                len++;
            }
            System.out.println();
            hei++;
        }
    }
}