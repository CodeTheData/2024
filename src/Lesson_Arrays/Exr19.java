package Lesson_Arrays;

/**
 *
 * 19. Вставка элемента в массив
 *
 * Требуется добавить элемент в произвольное место массива.
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Exr19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int index = scanner.nextInt(); //индекс где заменить
        int value = scanner.nextInt(); //каким числом заменить
        int length = scanner.nextInt(); //длина массива


        int[] arr = new int[length];
        int[] arr1 = new int[arr.length + 1];

        //Заполняем массив
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(arr));

        //Копируем элементы из начального массива до заданного индекса
        // и вставляем новый элемент по заданному индексу
        for (int i = 0; i < index; i++) {
                arr1[i] = arr[i];
                arr1[index] = value;
        }

        //Копируем оставшиеся элементы
        for (int j = index + 1; j < arr1.length; j++) {
            arr1[j] = arr[j - 1];
        }
        System.out.println(Arrays.toString(arr1));

    }
}

