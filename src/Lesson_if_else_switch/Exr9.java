package Lesson_if_else_switch;

/**
 * Високосный год или нет:
 * С клавиатуры вводится год. Программа должна определять високосный это год или нет.
 * Вывести на экран соответствующую надпись, а также количество дней в году.
 */

import java.util.Scanner;

public class Exr9 {
    public static void main(String[] args) {
        System.out.println("Введите год для проверки: ");

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int days = 0;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            days = 366;
            System.out.println("Год високосный \nКол-во дней: " + year);
        } else {
            days = 365;
            System.out.println("Год невисокосный \nКол-во дней: " + year);
        }

    }
}
