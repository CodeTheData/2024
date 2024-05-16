package Lesson_Cycles;

/**
 * 17. Определить количество простых чисел
 *
 * С клавиатуры вводятся целые числа до первого числа, которое меньше двух.
 * Написать программу, которая определяет сколько простых чисел было введено.
 *
 * Простые числа - это натуральные числа больше единицы,
 * которые делятся нацело только на единицу и на себя.
 * Например, число 3 простое, так как нацело делится только на 1 и 3.
 * Число 4 сложное, так как нацело делится не только на 1 и 4,
 * но также на число 2.
 *
 */

import java.util.Scanner;

public class Exr17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;
        boolean flag = false;

        while (num > 1) {

            flag = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                count += 1;
            }

            num = scanner.nextInt();

        }

        System.out.println(count);

    }
}
