package Lesson_Arrays;

/**
 *
 * 17. Самая длинная последовательность, состоящая из одинаковых элементов
 *
 * Найти в массиве самую длинную последовательность,
 * состоящую из одинаковых элементов.
 * Вывести на экран количество элементов самой длиной последовательности
 * и номер элемента, который является ее началом.
 */


import java.util.Arrays;
import java.util.Random;


public class Exr17 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] arr = new int[]{1, 2, 3, 4, 3, 3, 4, 5, 5, 5, 5, 5};

        System.out.println(Arrays.toString(arr));

        int len_max = 1;
        int len_current = 1;
        int start_current = 1;
        int start_max = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                len_current += 1;
            } else {
                if (len_current > len_max) {
                    len_max = len_current;
                    start_max = start_current;
                }
                len_current = 1;
                start_current = i + 1;
            }

        }

        if (len_current > len_max) {
            len_max = len_current;
            start_max = start_current;
        }

        System.out.println("Начало последовательности: " +  start_max);
        System.out.println("Длина последовательности: " +  len_max);

    }
}
