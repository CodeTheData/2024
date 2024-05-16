package Doub_Massive;

import java.util.Scanner;

public class Stars1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length1 = scanner.nextInt();
        int length2 = scanner.nextInt();
        String[][] arr = new String[length1][length2];
        String b = "*";

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = b;
            }
        }


        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i > j) {
                    System.out.print(arr[i][j]);
//                } else if (i > j) {
//                    System.out.print(arr[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
