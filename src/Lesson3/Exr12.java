package Lesson3;

/**
 * Дано целое число, состоящее из разных цифр. Определить,
 * какая из цифр заданного числа больше,
 * т. е. найти наибольшую цифру числа.
 */

import java.util.Scanner;

public class Exr12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for (int i = scanner.nextInt(); i > 0; i /= 10) {
            int c = i % 10;
            if (c > max) {
                max = c;
            }
        }
        System.out.println(max);

        /*
        int n = scanner.nextInt();
            while (n > 0) {
                int c = n % 10;
                if (c > max) {
                    max = c;
                }
                n /= 10;
            }
        System.out.println(max);
         */
    }
}
