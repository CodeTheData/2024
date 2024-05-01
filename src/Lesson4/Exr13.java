package Lesson4;

/**
 *Проверено мной!
 *
 * В заданном массиве чисел найти (посчитать) количество положительных
 * и количество отрицательных элементов.
 */

import java.util.Scanner;

public class Exr13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int plus_count = 0;
        int minus_count = 0;

        int[] arr = new int[] {0, -2, -1 , 3, 10, -22, -1, 0, 6, -200};

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] > 0) {
                plus_count += 1;
            } else if (arr[i] < 0) {
                minus_count += 1;
            }
        }

        System.out.println("Кол-во полож.элементов: " + plus_count + "\nКол-во отриц.элементов: " + minus_count);

    }
}
