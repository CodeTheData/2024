package Lesson_Arrays;

/**
 * Проверено мной!
 *
 *
 * 1. Сумма и произведение элементов одномерного массива
 *
 */

public class Exr1 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        int sum = 0;
        int mult = 1;

        //Заполнение массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        //Вывод элементов массива на консоль
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        //Сумма элементов массива
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        //Произведение элементов массива
        for (int i = 0; i < arr.length; i++) {
            mult *= arr[i];
        }

        System.out.println(sum);
        System.out.println(mult);

    }
}
