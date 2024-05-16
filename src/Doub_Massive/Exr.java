package Doub_Massive;

import java.util.Arrays;

public class Exr {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.println(arr[i][j]);
                }
            }
        }


    }
}


/**
 * int[][] arr = new int[3][3];
 *
 *         for(int i = 0; i < arr.length; i++) {
 *             for(int j = 0; j < arr[i].length; j++) {
 *                 arr[i][j] = (int) (Math.random() * 10);
 *             }
 *         }
 *
 *         for(int i = 0; i < arr.length; i++) {
 *             for(int j = 0; j < arr[i].length; j++) {
 *                 System.out.print(arr[i][j] + " ");
 *             }
 *             System.out.println();
 *         }
 *
 *     }
 * //    0_0 01 02
 * //    10 1_1 12
 * //    20 21 2_2
 */