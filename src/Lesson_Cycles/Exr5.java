package Lesson_Cycles;

/**
 * 5. Вычисление факториала числа
 *
 * Вычислить факториал числа, которое ввел пользователь.
 * 7! = 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040
 */

import java.util.Scanner;

public class Exr5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Рассчитать факториал числа: ");
        int digit = scanner.nextInt();
        System.out.print(digit + "!" + " = ");

        int factorial = 1; // !!! потому что !0 = 1 и !1 = 1 !!!

        System.out.print("1 * ");

        for (int i = 2; i <= digit; i++) {
            factorial = factorial * i;
            if (i < digit) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i);
            }
        }
        System.out.print(" = " + factorial);

    }
}
