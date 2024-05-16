package Lesson_Cycles;

/**
 * На вход поступает число месяц - вывести литеральное значение этгго месяца(1 - январь)
 */

import java.util.Scanner;

public class Exr_Switch1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int digit = scanner.nextInt();
        System.out.println("Введите номер месяца: ");
        int month = scanner.nextInt();


        switch (month) {
            case 12:
                System.out.println(digit + " декабря");
                break;
            case 1:
                System.out.println(digit + " января");
                break;
            case 2:
                System.out.println(digit + " февраля");
                break;
            case 3:
                System.out.println(digit + " марта");
                break;
            case 4:
                System.out.println(digit + " апреля");
                break;
            case 5:
                System.out.println(digit + " майя");
                break;
            case 6:
                System.out.println(digit + " июня");
                break;
            case 7:
                System.out.println(digit + " июля");
                break;
            case 8:
                System.out.println(digit + " августа");
                break;
            case 9:
                System.out.println(digit + " сентября");
                break;
            case 10:
                System.out.println(digit + " октября");
                break;
            case 11:
                System.out.println(digit + " ноября");
                break;
            default:
                System.out.println("Месяц введен не корректно!");
        }

    }
}
