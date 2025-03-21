public class TaskTwo {
    public static void main(String[] args) {
        //Ошибка с выходом за границу
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        // Исправлено условие цикла: i < numbers.length
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Сумма чисел: " + sum);
    }
}
