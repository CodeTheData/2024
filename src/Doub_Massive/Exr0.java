package Doub_Massive;

/**
 * Найти индексы максимальных элементов каждого ряда матрицы
 *
 * !!!всегда отдельный цикл на вывод массива и отдельный цикл на заполнение!!!
 */

//236
//719
//396


public class Exr0 {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println(max);
            max = 0;
        }

    }
}
