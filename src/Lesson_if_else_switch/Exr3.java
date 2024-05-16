package Lesson_if_else_switch;

import java.util.Scanner;

/**
 * Вывести нечетное число:
 * Из двух чисел с разной четностью вывести на экран нечетное число.
 */

public class Exr3 {
    public static void main(String[] args) {

        Scanner dig = new Scanner(System.in);

        System.out.println("Введите 2 числа: ");
        int value1 = dig.nextInt();
        int value2 = dig.nextInt();

        int nech = 0;

        if (value1 % 2 == 0 && value2 % 2 != 0) {
            nech = value2;
        } else if (value1 % 2 != 0 && value2 % 2 == 0) {
            nech = value1;
        } else {
            System.out.println("Оба нечетные или Оба четные");
        }
        System.out.println("Нечетное число: " + nech);
    }
}
