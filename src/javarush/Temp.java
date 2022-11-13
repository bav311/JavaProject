/*Амиго и Диего нужно взломать базу данных пиратов и внести туда свои имена,
чтобы выдть себя за пиратов. При этом нужно испортить данные о двух других пиратах.

Тебе нужно реализовать два метода. Первый — corruptDB должен найти в БД пару имен,
содержащих символ b, и в них заменить все символы b на escape-последовательность \b.
Второй метод, addTwoNames, должен изменить БД: она должна стать длиннее на 2,
и в конце содержать два новых имени: "Рыжий Амиго" и "Одноглазый Диего".

Требования:
Метод corruptDB должен найти в массиве piratesDB два элемента содержащих символ 'b' и
заменить в них все символы 'b' tа '\b'
Метод addTwoNames должен записать в piratesDB массив на 2 длиннее, с двумя новыми именами в конце.*/

package javarush;

import java.util.Arrays;

public class Temp {

    public static String[] piratesDB = {
            "Nebula",
            "boba Fett",
//            "Drax",
//            "Yondu Udonta",
//            "Maz Kanata",
//            "キャプテン・ハーロック",
//            "Star-Lord",
//            "Christopher Summers",
//            "Крысс",
//            "Весельчак У",
//            "Han Solo",
//            "Rocket b"
    };

    public static void main(String[] args) {
        System.out.println(Arrays.toString(piratesDB));
        corruptDB(piratesDB);
        addTwoNames(piratesDB);
        System.out.println(Arrays.toString(piratesDB));
    }

    public static void corruptDB(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("b")) {
                if (count < 2) {
                    array[i] = array[i].replace("b", "\b");
                    count++;
                }
            }
        }
    }

    public static String[] addTwoNames(String[] array) {
        String[] newArray = new String[0];
        return newArray = Arrays.copyOf(array, array.length + 2);
    }

}