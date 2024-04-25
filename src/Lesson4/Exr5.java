package Lesson4;

/**
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

import java.util.Scanner;

public class Exr5 {
    public static void main(String[] args) {

        int[] arr = new int[6];

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();//индекс
        int b = scanner.nextInt();//число

        int[] arr3 = new int[arr.length + 1];

        for (int i = 0; i < a; i++) {
            arr3[i] = arr[i];
        }

    }
}
