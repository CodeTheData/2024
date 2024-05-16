package Lesson_Cycles;

import java.util.Scanner;

/**
 * 3. Возведение числа в степень
 *
 * Возводит число в целочисленную степень. Число и степень вводятся с клавиатуры.
 */

public class Exr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double d = scanner.nextInt();
        double res = 1;
        double res1 = 0;

        if (d < 0) {
            for (int i = -1; i >= d; i--) {
                res *= n;
                res1 = 1 / res;
            }
            System.out.println(res1);
        } else {
            for (int i = 1; i <= d; i++) {
                res *= n;
            }
            System.out.println(res);
        }

    }
}
