import java.util.*;
import java.util.stream.IntStream;

public class TaskOne {
    public static void main(String[] args) {
        //Todo: Вывести числа в строку Фибоначчи до введенного пользователем числа в отдельном методе и подсчитать количество.
        // Фибоначчи - каждое следующее число равно сумме двух предыдущих. Первые два числа заданы сразу и равны 0 и 1.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int limit = scanner.nextInt();
        int[] array = new int[limit];

        IntStream.range(0, limit)
                .forEach(index -> array[index] = index);


        // Список для хранения чисел Фибоначчи
        List<Integer> filteredFibonacci = new ArrayList<>();

        // Заполняем массив и фильтруем числа
        derivationFibonacci(array,limit,filteredFibonacci);

        System.out.print("Числа Фибоначчи до " + array.length + ": " + filteredFibonacci);
    }

    public static void derivationFibonacci(int[] arr,int limit,List<Integer> filteredFibonacci) {
        if (arr.length >= 1) {
            arr[0] = 0;
            filteredFibonacci.add(arr[0]);
        }
        if (arr.length >= 2) {
            arr[1] = 1;
            filteredFibonacci.add(arr[1] );
            }

        // Заполняем массив и фильтруем числа
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            if (arr[i] > limit) {
                break;
            }
            filteredFibonacci.add(arr[i]);
        }
    }
}