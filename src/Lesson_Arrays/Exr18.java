package Lesson_Arrays;

/**
 * Есть ли в массиве одинаковые элементы
 *
 * Дан массив целых чисел.
 * Проверить, есть ли в нем одинаковые элементы.
 *
 */

import java.util.Random;
import java.util.Arrays;

public class Exr18 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] arr = new int[15];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count += 1;
                    System.out.println("Значение по индексу " + i + " равно значению по индексу " + j + " = " + arr[i]);
                }
            }
        }

        if (count > 0) {
            System.out.println("Есть одинаковые элементы!");
        } else {
            System.out.println("Все элементы уникальны!");
        }

    }
}
