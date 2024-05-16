package Lesson_Cycles;

/**
 * 15. Найти одинаковые цифры двух чисел
 *
 *  Найти одинаковые цифры двух чисел.
 */

import java.util.Scanner;

public class Exr15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int d = 0;
        int c = 0;

        while (a > 0) {
            d = a % 10;
            a /= 10;
            c = b;
            while (c > 0) {
                if (d == c % 10) {
                    System.out.print(d + " ");
                    break;
                }
                c /= 10;

            }
        }
    }
}
