import java.util.Arrays;

public class StringUtils {
    public static void main(String[] args) {
        String studentOne = "Ruslan";
        String studentTwo = "Vasilis";
        String studentThree = "Natali312";
        System.out.println("Метод для переворота строки:  " + reverseString(studentOne));
        System.out.println("Метод для проверки анаграммам:  " + areAnagrams(studentOne, studentTwo));
        System.out.println("Метод для замены чисел в строке на символ 'X':  " + replaced(studentThree));
    }

    //Todo: Напишите метод для переворота строки задом наперед с помощью массива символов.
    public static String reverseString(String line) {
        //return new StringBuffer(line).reverse().toString();

        if (line == null || line.isEmpty()) {
            return line;
        }

        // Преобразуем строку в массив символов
        char[] charArray = line.toCharArray();

        // Переворачиваем массив символов
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        // Возвращаем перевернутую строку
        return new String(charArray);
    }

    //Todo: Напишите метод для проверки areAnagrams, принимающего 2 строки, являются ли они анаграммами.
    public static boolean areAnagrams(String str1, String str2) {

        // Удаляем пробелы и приводим строки к нижнему регистру
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Если длины строк разные, они не могут быть анаграммами
        if (str1.length() != str2.length()) {
            return false;
        }

        // Преобразуем строки в массивы символов и сортируем их
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Сравниваем отсортированные массивы
        return Arrays.equals(charArray1, charArray2);
    }

    //Todo: Напишите метод для замены всех чисел в строке на символ "X".
    public static String replaced(String input) {
        return input.replaceAll("\\d", "X");
    }


}