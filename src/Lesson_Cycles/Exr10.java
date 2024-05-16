package Lesson_Cycles;

/**
 * 10. Посчитать четные и нечетные цифры числа
 *
 * Написать программу, подсчитывающую кол-во чет и нечет цифр числа.
 */

import java.util.Scanner;

public class Exr10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int mult = 1;

        for (int i = scanner.nextInt(); i > 0; i /= 10) {
            int c = i % 10;
            sum += c;
            mult *= c;
        }
        System.out.println(sum + "\n" + mult);

        /*
        while (n > 0) {
         int c = n % 10;
            sum += c;
            mult *= c;
            n /= 10;
        }
        System.out.println(sum + "\n" + mult);
         */


    }
}

