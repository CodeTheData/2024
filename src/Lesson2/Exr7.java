package Lesson2;

import java.util.Scanner;

/**
 * Определить возможность существования треугольника по сторонам:
 * Вводятся длины трех сторон предполагаемого треугольника. Определить,
 * может ли существовать треугольник с такими сторонами при условии что,
 * треугольник существует только тогда, когда ни одна его сторона не превышает сумму двух других
 */

public class Exr7 {
    public static void main(String[] args) {

        System.out.println("Введите стороны треугольника: ");
        Scanner dig = new Scanner(System.in);

        int x = dig.nextInt();
        int y = dig.nextInt();
        int z = dig.nextInt();

        if (x < y + z && y < x + z && z < x + z) {
            System.out.println("Труегольник существует!");
        } else {
            System.out.println("Треугольник не существует!");
        }

    }
}
