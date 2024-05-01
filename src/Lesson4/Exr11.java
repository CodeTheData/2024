package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Проверено мной!
 *
 * В массиве найти минимальный и максимальный элементы, поменять их местами.
 */

public class Exr11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max_num = 0;
        int min_num = 0;

        int index_max = 0;
        int index_min = 0;

        int[] arr = new int[] {4, 3, 10, 6, 15, 22};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_num) {
                max_num = arr[i];
                index_max = i;
            }

            /**
             * В куске кода ,строки 31-34, задебажил ошибку. Изначально в переменную
             * min_num записал элемент нулевого индекса, как самый минимальный.
             *
             * После if он не перезаписывал новое значение , а оставлял заданное изначально.
             *
             * Решение: поставил сразу условие , что за мин число будет принято число(под индексом "0")
             */
            if (arr[i] < arr[0]) {
                min_num = arr[i];
                index_min = i;
            }
        }

        arr[index_max] = min_num;
        arr[index_min] = max_num;
        System.out.println("Итоговый массив: " + Arrays.toString(arr) + "\nИндекс макс.элемента: " + index_max + "\nИндекс мин.элемента: " + index_min);

    }
}
