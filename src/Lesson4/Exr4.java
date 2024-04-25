package Lesson4;

/**
 * Есть массив (перекопировтаь, его в новый массив).
 */

public class Exr4 {
    public static void main(String[] args) {

        int[] arr = new int[6];

        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
