package Lesson_Cycles;

/**
 * 16. Удалить цифру из числа
 *
 * Удалить цифру из числа
 */

import java.util.Scanner;

public class Exr16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 5683 начальное число
        int ch = scanner.nextInt(); // 5   число, которое необходимо удалить

        int c = 0;
        int raz = 1;


        while (n > 0) {
            int a = n % 10;
            if (ch != a) {
                c = c + a * raz;
                raz *= 10;
            }
            n /= 10;
        }
        System.out.println(c);

    }
}
