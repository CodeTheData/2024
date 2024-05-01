package Lesson4;

/**
 * Проверено мной!
 *
 * Вставить элемент в массив .
 * С клавиатуры поступает 2 числа индекс-куда вставить и число-которое вставляешь.
 *
 * 1) Надо создать массив на размер больше
 * 2)до введенного индекса перекопировать элементы в том же порядке
 * как они и шли
 * 3) вставить нужный элемент в ячейку
 * 4)продолжить копирование элементов
 */

//arr[i] - это элемент по индексу
//а i - это индекс

import java.util.Arrays;
import java.util.Scanner;

public class Exr5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int index = scanner.nextInt(); // Индекс
        int num = scanner.nextInt(); // Число


        int[] arr = new int[] {1, 5, 20, 2, 7};
        int[] arr1 = new int[arr.length + 1];


        if (index < arr.length) {
            for (int i = 0; i < index; i++) {
                arr1[i] += arr[i];
            }
            arr1[index] = num;

            for (int i = index; i < arr.length; i++) {
                arr1[i + 1] = arr[i];
            }

            System.out.println(Arrays.toString(arr1));
        } else {
            System.out.println("Выход за рамки длинны массива!");
        }

    }
}
