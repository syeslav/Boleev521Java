import java.util.ArrayList;
import java.util.List;

//Todo:Данную задачу решаю для себя, можете не считать ее) Ханойская башня.

public class TaskTwo {
    public static void main(String[] args) {
        int numRings = 5; // Количество колец

        List<Integer> source = new ArrayList<>(); // Исходный стержень
        List<Integer> auxiliary = new ArrayList<>(); // Промежуточный стержень
        List<Integer> target = new ArrayList<>(); // Целевой стержень

        // Заполняем исходный стержень кольцами (от большего к меньшему)
        for (int i = numRings; i > 0; i--) {
            source.add(i);
        }

        // Выводим начальное состояние
        System.out.println("Начальное состояние:");
        printTowers(source, auxiliary, target);

        // Решение задачи
        hanoiTower(numRings, source, auxiliary, target, "Source", "Auxiliary", "Target");

        // Выводим конечное состояние
        System.out.println("\nКонечное состояние:");
        printTowers(source, auxiliary, target);
    }

    /*public static void hanoiTower(int numRings,
                                  List<Integer> source,
                                  List<Integer> auxiliary,
                                  List<Integer> target,
                                  String sourceName,
                                  String auxiliaryName,
                                  String targetName) {
        if (numRings > 0) {
            // Перемещаем n-1 колец с исходного на промежуточный стержень
            hanoiTower(numRings - 1, source, target, auxiliary, sourceName, targetName, auxiliaryName);

            // Перемещаем самое большое кольцо с исходного на целевой стержень
            int ring = source.remove(source.size() - 1);
            target.add(ring);
            System.out.println("\nПеремещаем кольцо " + ring + " с " + sourceName + " на " + targetName);

            // Выводим текущее состояние стержней
            printTowers(source, auxiliary, target);

            // Перемещаем n-1 колец с промежуточного на целевой стержень
            hanoiTower(numRings - 1, auxiliary, source, target, auxiliaryName, sourceName, targetName);
        }
    }

    // Метод для вывода текущего состояния стержней
    public static void printTowers(List<Integer> source, List<Integer> auxiliary, List<Integer> target) {
        System.out.println("Source: " + source);
        System.out.println("Auxiliary: " + auxiliary);
        System.out.println("Target: " + target);
    }
}*/