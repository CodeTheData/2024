package Lesson4;

/**
 * //int[] arr = new int[10];
 * //arr[0] = 12;
 * //arr[1] = 13;
 * //arr[2] = 14;
 * //
 * //        System.out.println(arr[0]);
 * //        System.out.println(arr[1]);
 * //        System.out.println(arr[2]);
 * //
 * //        System.out.println(arr.length + " efwfwwfwfwfwfwfwfwfwfwfw");
 * ////Заполнение массива
 * //        for(int i = 0; i < arr.length; i++) {
 * //arr[i] = i + 1;
 * //        }
 * //
 * //        //!!!! На одну операцию - 1 цикл
 * //        //Вывод массива
 * //        for(int i = 0; i < arr.length; i++) {
 * //        System.out.println(arr[i]);
 * //        }
 *
 */

public class Exr1 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        int sum = 0;
        int mult = 1;

        //Заполнение массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        //Вывод элементов массива на консоль
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        //Сумма элементов массива
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        //Произведение элементов массива
        for (int i = 0; i < arr.length; i++) {
            mult *= arr[i];
        }

        System.out.println(sum);
        System.out.println(mult);

    }
}
