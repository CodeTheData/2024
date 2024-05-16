package Lesson_Cycles;

/**
 * 4. Составьте таблицу значений функции
 *
 *
 * Используя цикл написать программу,
 * которая выводит на экран таблицу значений функции y = 5 - x2/2
 * на отрезке [-5; 5] с шагом 0.5
 */

public class Exr4 {
    public static void main(String[] args) {

        System.out.println("  x      y  ");
        double x = 0;

        /*while (x <= 5) {
           double y = 5 - (x * x) / 2;
           System.out.println(x + " | " + y);
           x = x + 0.5;
        }

         */

        for (double i = -5; i <= 5; i += 0.5) {
            double y = 5 - (i * i) / 2;
            System.out.println(i + " | " + y);
        }

    }
}
