/*Активируем системы корабля, подключая следующие объекты:
пушка (Gun), ремонтный дрон (RepairDrone),
робот уборщик (RobotCleaner),
авто-кухня (AutomaticKitchen),
генератор защитных полей (ProtectiveFieldGenerator).
Эти объекты помогут кораблю в будущем полете, а Анжелика сможет ими управлять.
В методе main() создай по одному объекту каждого класса из перечисленных.

Требования:
В методе main() нужно создать один объект класса AutomaticKitchen.
В методе main() нужно создать один объект класса Gun.
В методе main() нужно создать один объект класса ProtectiveFieldGenerator.
В методе main() нужно создать один объект класса RepairDrone.
В методе main() нужно создать один объект класса RobotCleaner..*/

package javarush.solution;


public class Solution {
    public static void main(String[] args) {
        AutomaticKitchen automaticKitchen = new AutomaticKitchen();
        Gun gun = new Gun();
        ProtectiveFieldGenerator protectiveFieldGenerator = new ProtectiveFieldGenerator();
        RepairDrone repairDrone = new RepairDrone();
        RobotCleaner robotCleaner = new RobotCleaner();


    }
}