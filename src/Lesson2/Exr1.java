package Lesson2;

/**
 * Определить какое из трех введенных пользователем чисел максимальное и вывести его на экран.
 */

import java.util.Scanner;

public class Exr1 {
    public static void main(String[] args) {

        // МАКСИМАЛЬНОЕ = КОТОРОЕ БОЛЬШЕ ДВУХ ДРУГИХ
        Scanner dig = new Scanner(System.in);

        System.out.println("Введите 3 числа: ");
        int value1 = dig.nextInt();
        int value2 = dig.nextInt();
        int value3 = dig.nextInt();
        int max = 0;

        if (value1 > value2 && value1 > value3) {
            max = value1;
        } else if (value2 > value1 && value2 > value3) {
            max = value2;
        } else if (value3 > value1 && value3 > value3) {
            max = value3;
        } else {
            System.out.println("Вы ввели равные числа, ошибка!");
        }

        System.out.println("Максимальное число: " + max);


        /* ГОВНО КОД МОЙ
        if (max > value2 && max > value3) {
        } else if (value2 > value3) {
            max = value2;
        } else {
            max = value3;
        }
        System.out.println("Максимальное число: " + max);
         */
    }
}
