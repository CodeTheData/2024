package Lesson3;

/**
 * вывести все квадраты натуральных чисел , не превосходящие данного числа N
 *
 * сноска:
 * while (digit2 < value_max) {
 *  digit2 = digit1 * digit1;
 *  System.out.print(digit2 + " ");
 *  digit1 += 1;
 *
 *  Ошибка:
 *  Если написать такой код,
 *  то пройдёт итерация с записью в digit2 значения и вывода его,
 *  а только потом это значения сравнится с value_max и не пройдёт условие
 *
 */

public class Exr1 {
    public static void main(String[] args) {

        int value_max = 50;
        int digit = 1; //счетчик
        int digit1 = 1;

        while (digit1 < value_max) {
            System.out.print(digit1 + " ");
            digit += 1;
            digit1 = digit * digit;
        }
    }
}
        /* Решение через for:
        for (int i = 1; i + digit < value_max; i++) {
            System.out.println((digit = i * i) + " ");
        }
         */

