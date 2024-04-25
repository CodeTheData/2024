package Lesson2;

import java.util.Scanner;

/**
 * Вычисление площадей геометрических фигур:
 * Написать программу, которая в зависимости от выбора пользователя
 * вычисляет площадь одной из трех геометрических фигур: прямоугольника, треугольника или круга.
 */

public class Exr8 {
    public static void main(String[] args) {


        System.out.println("Введите номер фигуры: ");

        Scanner scanner = new Scanner(System.in);
        int figure = scanner.nextInt(); //1 - Прямоугольник, 2 - Треугольник, 3 - Круг

        double square = 0;
        double pi = 3.14d;

        if (figure == 1) {
            System.out.println("Введите 1 сторону: ");
            int arg1 = scanner.nextInt();
            System.out.println("Введите 2 сторону: ");
            int arg2 = scanner.nextInt();
            square = arg1 * arg2;
        } else if (figure == 2) {
            System.out.println("Введите 3 стороны: ");
            int arg1 = scanner.nextInt();
            int arg2 = scanner.nextInt();
            int arg3 = scanner.nextInt();
            if (arg1 < arg2 + arg3 && arg2 < arg1 + arg3 && arg3 < arg1 + arg2) {
                square = (arg1 * arg2 * arg3) / 2;
            } else {
                System.out.println("Ошибка!");
            }
        } else if (figure == 3) {
            System.out.println("Введите диаметр круга: ");
            double diametr = scanner.nextInt();
            square = (pi * (diametr * diametr)) / 4;
        } else {
            System.out.println("Ошибка!");
        }

        if (square > 0) {
            System.out.println("Площадь равна:" + square);
        } else {
            System.out.println("Ошибка!");
        }

    }
}
