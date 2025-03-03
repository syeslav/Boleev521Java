import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TaskOne {
    public static void main(String[] args) {
        //Todo: Вывести числа в строку Фибоначчи до введенного пользователем числа в отдельном методе и подсчитать количество.
        // Фибоначчи - каждое следующее число равно сумме двух предыдущих. Первые два числа заданы сразу и равны 0 и 1.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int input = scanner.nextInt();
        int[] array = new int[input];

        IntStream.range(0, input)
                .forEach(index -> array[index] = index);

        derivationFibonacci(array);

        System.out.print(Arrays.toString(array) +
                " count: " + array.length);
    }

    public static void derivationFibonacci(int[] arr) {
        if (arr.length >= 1) {
            arr[0] = 0;
        }
        if (arr.length >= 2) {
            arr[1] = 1;
            }
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
    }
}