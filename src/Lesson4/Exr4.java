package Lesson4;

/**
 * Есть массив (перекопировтаь, его в новый массив).
 */

public class Exr4 {
    public static void main(String[] args) {

        int[] arr = new int[] {3, 2, 10, 1, 9};

        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
