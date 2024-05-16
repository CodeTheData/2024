package Lesson_if_else_switch;

import java.util.Scanner;

/**
 * Найти среднее число из трех:
 * Среди трех чисел найти среднее. Если среди чисел есть равные, вывести сообщение "Ошибка".
 */

public class Exr2 {
    public static void main(String[] args) {

        System.out.println("Введите 3 числа: ");
        Scanner dig = new Scanner(System.in);

        int value1 = dig.nextInt();
        int value2 = dig.nextInt();
        int value3 = dig.nextInt();

        int res = 0;

        if (value1 > value2 && value1 < value3 || value1 < value2 && value1 > value3) {
            res = value1;
        } else if (value2 > value1 && value2 < value3 || value2 < value1 && value2 > value3) {
            res = value2;
        } else {
            res = value3;
        }
        System.out.println(" " + res);
    }
}
