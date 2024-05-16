package Lesson_if_else_switch;

import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Вычисление значения функции:
 * Требуется написать программу, вычисляющую значение какой-либо функции у = f(x).
 */

public class Exr5 {
    public static void main(String[] args) {

        Scanner dig = new Scanner(System.in);

        System.out.println("Введите значение х: ");
        int x = dig.nextInt();
        int y = 0;

        if (x > 0) {
            y = x - 2;
        } else if (x == 0) {
            y = 0;
        } else {
            y = abs(x);
        }
        System.out.println("y = " + y);

    }
}
