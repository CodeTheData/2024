package Lesson1;

/**
 * C клавиатуры поступает число, / если оно положительное / вывести - число x положительное.
 *
 */

import java.util.Scanner;

public class Exr3 {
    public static void main(String[] args) {

        Scanner dig = new Scanner(System.in);

        System.out.println("Введите ваше число: ");
        int value = dig.nextInt();

        if (value > 0) {
            System.out.println("Ваше число положительное: " + value);
        } else {
            System.out.println("Ваше число отрицательное: " + value);
        }



    }
}
