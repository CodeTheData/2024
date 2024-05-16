package Lesson_Arrays;

/**
 * Проверно мной!
 *
 * 2. Сумма положительных элементов массива
 *
 * Вывести сумму четных и нечетных элементов массива.
 */

public class Exr2 {
    public static void main(String[] args) {

        int[] arr = new int[6];
        int sum = 0;
        int sub = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            } else {
                sub += arr[i];
            }
        }
        System.out.println(sum + "\n" + sub);

    }
}
