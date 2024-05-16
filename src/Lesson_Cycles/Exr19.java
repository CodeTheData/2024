package Lesson_Cycles;

/**
 * 19. Совершенные числа
 *
 * Число совершенно, если оно равно сумме всех своих делителей,
 * кроме самого себя. Пример: 6 = 1 + 2 + 3.
 * Найдите все совершенные числа от 1 до 10000
 * и выведите их на экран.
 *
 */

import java.util.Scanner;

public class Exr19 {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);

        int fnum = 1;
        int lnum = 10000;



        for (int i = fnum; i < lnum; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }

            if (sum == i) {
                System.out.println("Число " + i + " является совершенным");
            }

        }


    }
}
