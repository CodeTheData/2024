package Lesson_Cycles;

/**
 * Решил!
 *
 * Программа "Угадай число"
 *
 * Отгадать целое число, которое "загадал" компьютер в определенном диапазоне.
 */

import java.util.Scanner;
import java.util.Random;

public class Exr26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Система загадала число");
        int aiNumber = random.nextInt(10);


        while (true) {

            System.out.println("Попробуйте угадать число в пределах от 0 до 9 (включительно)");
            int answer = sc.nextInt();
            if (answer == aiNumber) {
                System.out.println("Угадали!");
            } else {
                System.out.println("Попробуйте другое число!");
            }
        }



    }
}
