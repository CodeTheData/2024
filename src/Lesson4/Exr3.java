package Lesson4;

/**
 * Вывести сумму четных и нечетных элементов массива, !!! только у половины элементов массива.
 */

public class Exr3 {
    public static void main(String[] args) {

        int[] arr = new int[6];
        int sum = 0;
        int sub = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);

    }
}
