package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * В массиве найти минимальный и максимальный элементы, поменять их местами.
 */

public class Exr11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max_num = 0;
        int min_num = 0;

        int index_max = 0;
        int index_min = 0;

        int[] arr = new int[] {3, 4, 10, 6, 22, 15};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_num) {
                max_num = arr[i];
                index_max = i;
            }

            min_num = arr[0];
            if (arr[i] < min_num) {
                min_num = arr[i];
                index_min = i;
            }
        }
        arr[index_max] = min_num;
        arr[index_min] = max_num;
        System.out.println(Arrays.toString(arr) + " " + index_max + " " + index_min);

    }
}
