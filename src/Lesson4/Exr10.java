package Lesson4;

/**
 * В одномерном массиве найти минимальный и максимальный элементы. Вычислить их разность.
 */

import java.util.Scanner;

public class Exr10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;

        int[] arr = new int[] {3, 4, 10, 9, 11};

        // Ищем максимум
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            min = arr[0];
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int res = max - min;
        System.out.println("Максимальный элемент: " + max + "\nМинимальный элемент: " + min + "\n" + res);

    }
}
