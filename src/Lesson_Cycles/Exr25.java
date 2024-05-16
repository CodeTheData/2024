package Lesson_Cycles;

/**
 * 25. Простейший калькулятор
 *
 * Написать программу, в которой вводятся два числа-операнда x и y и знак арифметической операции (+, –, /, *).
 *
 * Вычислить результат z в зависимости от знака.
 *
 * Предусмотреть реакции на возможный неверный знак операции, а также на ввод y=0 при делении.
 *
 * Организовать возможность многократных вычислений без перезагрузки программы (то есть построить цикл).
 * В качестве символа прекращения вычислений принять '0'.
 */

import java.util.Scanner;

public class Exr25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine(); //!!!
        char c = scanner.nextLine().charAt(0); //!!!
        double z = 0;

        while (true) {
            double x = scanner.nextInt();
            double y = scanner.nextInt();

            if (x == 1) { // специально неверно ввел
                break;
            } else if (c == '+') {
                z = x + y;
            } else if (c == '-') {
                z = x - y;
            } else if (c == '*') {
                z = x * y;
            } else if (c == '/') {
                if (y == 0) {
                    System.out.println("Делить на 0 нельзя!");
                    break;
                } else {
                    z = x / y;
                }
            } else {
                System.out.println("Введен неверный знак!");
            }
            System.out.println(z);

        }
    }
}
