package Lesson2;

import java.util.Scanner;

/**
 * Проверка кратности числа:
 * Вводятся два числа (большее и меньшее). Определить, кратно ли первое число второму,
 * то есть делится ли первое число нацело на второе.
 * Вывести на экран сообщение об этом, а также остаток от деления, если первое число не кратно второму.
 */

public class Exr4 {
    public static void main(String[] args) {
        Scanner dig = new Scanner(System.in);

        System.out.println("Введите 2 числа: ");
        double value1 = dig.nextDouble();
        double value2 = dig.nextDouble();
        int ost = 0;

        if (value1 % value2 == 0) {
            System.out.println("Первое число кратно второму");
        } else {
            System.out.println("Остаток от деления: " + value1 % value2);
        }

    }
}
