package Lesson_Arrays;

/**
 * Проверено мной!
 *
 * 15. Элементы массива, которые больше предыдущего
 *
 * Вывести элементы числового массива, которые больше, чем элементы, стоящие перед ними.
 */

public class Exr15 {
    public static void main(String[] args) {

        int[] arr = new int[] {0, -2, -1 , 3, 10, -22, -1, 0, 6};
        int num = 0;
        //возьмем arr[0] - как самый первый элемент для сравнения

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                num = arr[i];
                System.out.println(num);
            }
        }

    }
}
