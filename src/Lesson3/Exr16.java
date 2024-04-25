package Lesson3;

/**
 * Удалить цифру из числа
 */

import java.util.Scanner;

public class Exr16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 5683
        int ch = scanner.nextInt(); // 5
        int c = 0;
        int raz = 1;


        while (n > 0) {
            int a = n % 10;
            if (ch != a) {
                c = c + a * raz;
                raz *= 10;
            }
            n /= 10;
        }
        System.out.println(c);

    }
}
