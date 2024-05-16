package Lesson_Arrays;

/**
 *
 * 9. Разделить элементы массива на максимальный
 *
 * Все элементы массива поделить на значение наибольшего элемента этого массива.
 */

import java.util.Arrays;

public class Exr9 {
    public static void main(String[] args) {

        double[] arr = new double[] {327, 381, 891, 918, 212, 848, 770, 363, 416, 736};
        double max_num = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_num) {
                max_num = arr[i];
            }
        }

        System.out.println("Исходный массив: " + Arrays.toString(arr) + "\nМаксимум: " + max_num + "\nЧастные: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] /= max_num;
            System.out.format("%.2f ", arr[i]);
        }

    }
}
