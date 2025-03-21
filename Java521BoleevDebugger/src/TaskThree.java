public class TaskThree {
    public static void main(String[] args) {
        // Условие завершения рекурсии неправильное
        int n = 5;
        int result = computeFactorial(n);
        System.out.println(n + "! = " + result);
    }

    public static int computeFactorial(int n) {
        // Исправлено условие завершения рекурсии
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * computeFactorial(n - 1);
        }
    }
}
