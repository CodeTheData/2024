package Lesson_Cycles;

/**
 * Решил!
 *
 * Комбинации из трех чисел, дающие в сумме заданное число
 *
 * Написать программу, которая находит все комбинации
 * из трех чисел до определенного предела,
 * которые в сумме дают другое число.
 *
 */

import java.util.Scanner;

public class Exr23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        int amount = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= limit; j++){
                for (int k = 1; k <= limit; k++){

                    sum = i + j + k;

                    if (sum == amount) {
                        System.out.println(i + " " + j + " " + k);
                    }

                }
            }
        }
    }
}
