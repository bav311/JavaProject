/*
Нужно рассчитать маршрут прохода через космическую аномалию.
На входе имеется массив anomalySpace с координатами (x, y, z).
Из него нам нужно выбрать только те координаты, в которых нет глубинных аномалий.
Координаты нужно использовать в формуле:
sin(x) * Pi + cos(y) * min(x, y, z) + tn(y) / ln(z) где min(x, y, z) - это минимум из трех чисел.

Если полученный результат попадает в диапазон от 100 до 200 включительно,
значит эти координаты безопасные, и этот результат нужно добавить в массив safeRoute
(уже создан в классе Solution). Если результат отрицательный - отбрасываем его.
        Требования:
        В методе main() нужно добавить в массив safeRoute результаты вычислений,
        которые попадают в диапазон [100, 200].

*/

package javarush.solution;


import java.util.Arrays;

public class AnomalySpace {

    public static int[][] anomalySpace = new int[][]{
            {383, 961, 904}, {769, 887, 770}, {184, 608, 406}, {310, 821, 445}, {412, 908, 158},
            {562, 844, 573}, {260, 880, 230}, {635, 254, 756}, {816, 754, 508}, {947, 195, 379},
            {576, 678, 682}, {207, 653, 588}, {901, 315, 223}, {310, 561, 255}, {199, 356, 350},
            {971, 276, 974}, {413, 829, 494}, {344, 345, 322}, {889, 713, 222}, {628, 963, 234},
            {254, 428, 926}, {633, 762, 848}, {896, 130, 653}, {971, 636, 861}, {328, 976, 139}};

    public static double[] safeRoute = new double[25];

    public static void main(String[] args) {
        printArray(anomalySpace);

        for (int i = 0; i < anomalySpace.length; i++) {
            int x = anomalySpace[i][0];
            int y = anomalySpace[i][1];
            int z = anomalySpace[i][2];
            double check = Math.sin(x) * Math.PI + Math.cos(y) * Math.min(x, Math.min(y,z)) + Math.tan(y) / Math.log(z);
            if (check >= 100 &&  check <= 200) {
                safeRoute[i] = check;
                i++;
            }
        }

        System.out.println(Arrays.toString(safeRoute));
    }

    public static void printArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();

        }
    }

}