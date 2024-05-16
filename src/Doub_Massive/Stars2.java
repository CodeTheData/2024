package Doub_Massive;

import java.util.Scanner;

public class Stars2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length1 = scanner.nextInt();
        int length2 = scanner.nextInt();

        char[][] arr = new char[length1][length2];
        String b = "*";
        char c = '*';


        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = c;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if (i == 0 || (i == 1 && j < 2) || (i == 2 && j < 1)) {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }

    }
}
