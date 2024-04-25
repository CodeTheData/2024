package Lesson3;

/**
 * Вывести на экран ряд чисел Фибоначчи
 * состоящий из N элементов. Значение N
 * вводится с клавиатуры.
 */

import java.util.Scanner;

public class Exr6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a + "," + b + ",");
        int c = 0;
        int n = scanner.nextInt();
        int sum = 0;

        while (n > 0) {
            c = n % 10;
            if (c % 2 == 0) {
                sum += c;
            }
            n /= 10;
        }
        System.out.println(sum);

    }
}
