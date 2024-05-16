package Lesson_Cycles;

/**
 * 8. Извлечение цифр числа
 *
 *
 * С клавиатуры вводятся два натуральных числа.
 * Определить цифры, входящие в запись как первого так и второго числа.
 */

import java.util.Scanner;

public class Exr8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();


        while (num1 > 0) {
            int cur1 = num1 % 10;
            num1 /= 10;
            int c = num2;
            while (c > 0) {
                int cur2 = c % 10;
                if (cur1 == cur2) {
                    System.out.print(cur1 + " ");
                    break;
                } else {
                    c /= 10;
                }
            }

        }

    }
}
