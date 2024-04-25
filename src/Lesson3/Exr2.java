package Lesson3;

/**
 * Вывести на экран кубы чисел от A до B, которые вводит пользователь.
 */

import java.util.Scanner;

public class Exr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        /*
        for (i = a; i <= b; i++) {
            System.out.println(i + " в кубе = " + i * i * i);
        }
         */

        while (a <= b) {
            System.out.println(a + " в кубе = " + a * a * a);
            a += 1;
        }

    }
}
