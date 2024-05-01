package Lesson4;

/**
 * Проверено мной!
 *
 * В одномерном массиве найти количество положительных элементов.
 */

import java.util.Scanner;

public class Exr12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int plus_count = 0;
        int[] arr = new int[] {-1, -4, 5, -3, 2, 2, 10};

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] > 0) {
                plus_count += 1;
            }
        }

        System.out.println("Кол-во положительных элементов: " + plus_count);

    }
}
