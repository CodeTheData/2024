package Lesson_Cycles;

/**
 * 18. Вывести делители чисел
 *
 * Для каждого натурального числа в промежутке от M до N
 * вывести все делители, кроме единицы и самого числа.
 * Значения M и N вводятся с клавиатуры.
 */

import java.util.Scanner;

public class Exr18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int fnum = sc.nextInt();
        int lnum = sc.nextInt();
        int del = 0;

        for(int i = fnum; i <= lnum; i++) {
            System.out.print("\n" + i + ": ");
            for(int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    del = j;
                    System.out.print(del + " ");
                }
            }
        }


    }
}

