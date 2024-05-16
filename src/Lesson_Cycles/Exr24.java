package Lesson_Cycles;

/**
 * Решил!
 *
 * Решение системы уравнений
 *
 * Требуется определить, сколько можно приобрести
 * ручек (по цене 10 руб.), карандашей (по 5 руб.)
 * и ластиков (по 2 руб.) на 100 рублей.
 * При этом всего предметов должно быть 30.
 *
 */

import java.util.Scanner;

public class Exr24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pen = 0;
        int pencil = 0;
        int eraser = 0;

        int c_pen = 10;
        int c_pencil = 5;
        int c_eraser = 2;

        int qty = 30;
        int sum = 100;

        for(pen = 0; pen < sum / c_pen; pen++) {
            for(pencil = 0; pencil < sum / c_pencil; pencil++) {
                for(eraser = 0; eraser < sum / c_eraser; eraser++) {
                    if (c_pen * pen + c_pencil * pencil + c_eraser * eraser == sum && pen + pencil + eraser == qty) {
                        System.out.println(pen + " " + pencil + " " + eraser);
                    }
                }
            }
        }

    }
}
