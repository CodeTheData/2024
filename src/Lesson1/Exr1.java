package Lesson1;

import java.util.Scanner;

/**
 * Вывести результат суммы цифр по нечет.порядку и произведение по чет.порядку.
 */

public class Exr1 {
    public static void main(String[] args) {

        System.out.println("Введите 6-и значное число: ");
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        int deln = value % 1000000 / 100000;
        int del1 = value % 100000 / 10000;
        int del2n = value % 10000 / 1000;
        int del3 = value % 1000 / 100;
        int del4n = value % 100 / 10;
        int del5 = value % 10;

        double sumn = deln + del2n + del4n;

        double sum = del1 * del3 * del5;

        double res = sumn / sum;

        System.out.println("Сумма цифр по нечет.порядку: " + sumn);
        System.out.println("Произведение цифр по чет.порядку: " + sum);
        System.out.println("Результат деления: " + res);
    }
}
