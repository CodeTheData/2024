package Lesson1;

/**
 * Вывести случайное число.
 */

public class Exr2 {
    public static int getRandomDiceNumber() {
        return (int) (Math.random() * 24) + 1;
    }

    public static void main(String[] args) {
        int res = (int) (Math.random() * 24) + 1;
        System.out.println("Ваше случайное число: " + res);
    }
}
