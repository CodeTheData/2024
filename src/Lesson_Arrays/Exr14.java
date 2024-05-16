package Lesson_Arrays;

/**
 * Проверено мной!
 *
 * 14. Вывести элементы массива, которые больше среднего арифметического
 *
 * Дан одномерный массив. Найти среднее арифметическое его элементов.
 * Вывести на экран только те элементы массива, которые больше найденного среднего арифметического.
 */


import java.util.Scanner;

public class Exr14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[] {34, 27, 47, 46, 15, 36, 36, 39, 38};
        int count = 0;
        double mid_value = 0;
        int res = 0;


        //Поиск среднего арифметического
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        mid_value = count / arr.length;
        System.out.println("Среднее арифметическое: "  + mid_value);

        //Поиск элементов больше среднего ариф.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid_value) {
                res = arr[i];
                System.out.print(" " + res);
            }
        }


    }
}
