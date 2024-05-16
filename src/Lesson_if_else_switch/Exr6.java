package Lesson_if_else_switch;

import java.util.Scanner;

/**
 *Требуется написать программу, определяющую по координатам точки,
 * в какой четверти она находится. Координаты точки вводятся с клавиатуры.
 */

public class Exr6 {
    public static void main(String[] args) {
        Scanner dig = new Scanner(System.in);
        System.out.println("Введите ваши числа: ");
        int x = dig.nextInt();
        int y = dig.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("Ваши значения находятся в 1 четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Ваши значения находятся в 3 четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Ваши значения находятся в 2 четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Ваши значения находятся в 4 четверти");
        } else {
            System.out.println("Вы попали в начало координат");
        }
    }
}
