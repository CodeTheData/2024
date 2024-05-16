package Lesson_Arrays;

/**
 *Проверено мной!
 *
 * 16. Определить индексы элементов массива, значение которых лежит в указанном пределе
 *
 * В массиве определить индексы элементов,
 * значение которых не меньше заданного минимума
 * и не больше заданного максимума.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Exr16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[10];
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int index = 0;

        //Второй способ:
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(101) - 50);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > min & array[i] < max) {
                index = i;
                System.out.println(index + " ");
            }
        }


        //Первый способ:
//        for (int i = 0; i < array.length; i++) {
//            array[i] = ((int)(Math.random() * 101) - 50);
//        }
//
//        System.out.println(Arrays.toString(array));


    }
}
