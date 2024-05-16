package Lesson_Arrays;

/**
 * Проверено мной!
 *
 * 8. Заменить элементы массива на противоположные
 *
 * Заменить элементы массива на противоположные.
 */

import java.util.Arrays;

public class Exr8 {
    public static void main(String[] args) {

        int[] arr = new int[] {3, -2, 20, -33, 20};

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
