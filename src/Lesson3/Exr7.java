package Lesson3;

/**
 * Переворот числа.
 */

import java.util.Scanner;

public class Exr7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int curn = 0;

        while (n > 0) {
            int c = n % 10;
            curn = curn * 10 + c; //321
            n /= 10;
        }
        System.out.println(curn);

    }
}
