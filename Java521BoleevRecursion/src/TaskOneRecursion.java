import java.util.*;

public class TaskOneRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int limit = scanner.nextInt();

        // Список для хранения чисел Фибоначчи
        List<Integer> filteredFibonacci = new ArrayList<>();

        // Заполняем список числами Фибоначчи до заданного предела
        derivationFibonacci(0, 1, limit, filteredFibonacci);

        System.out.print("Числа Фибоначчи до " + limit + ": " + filteredFibonacci);
    }

    public static void derivationFibonacci(int a, int b, int limit, List<Integer> filteredFibonacci) {
        if (a > limit) {
            return; //если текущее число превышает предел, завершаем рекурсию
        }

        // Добавляем текущее число Фибоначчи в список
        filteredFibonacci.add(a);

        //вызываем метод для следующего числа Фибоначчи
        derivationFibonacci(b, a + b, limit, filteredFibonacci);
    }
}