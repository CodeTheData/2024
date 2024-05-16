package Lesson_Cycles;

/**
 * 13. Сумма первой и последней цифр числа
 *
 *
 * Сумма первой и последней цифры числа.
 */

import java.util.Scanner;

public class Exr13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n % 10;
        int b = 0;
        n /= 10;  // убрали последню цифру вне цикла

        while (n > 0) {
            b = n % 10;
            n /= 10;
        }
        System.out.println(a + b);

    }
}
