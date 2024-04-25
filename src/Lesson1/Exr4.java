package Lesson1;

/**
 *  С клавы поступает чилсо , / если оно четное умножаем на 3, /  если нечетное делим на 2 , /  к итогу +100.
 */

import java.util.Scanner;

public class Exr4 {
    public static void main(String[] args) {
        System.out.println("Введите ваше число: ");
        Scanner dig = new Scanner(System.in);
        double value = dig.nextDouble();

        if (value % 2 == 0) {
            value *= 3;
        } else {
            value /= 2;
            System.out.println("Ваше число: " + value);
        }
        value += 100;
        System.out.println("Ваше число: " + value);
    }
}