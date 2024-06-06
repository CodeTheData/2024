package Lesson6;

/**
 * Возвращает количество (количество) гласных в заданной строке.
 *
 * Мы будем рассматривать , , , как гласные для этого ката (но не ).'a' 'e' 'i' 'o' 'u' 'y'
 *
 * Входная строка будет состоять только из строчных букв и/или пробелов.
 */

public class Exr2 {
    static final String VOWELS = "aeiouyAEIOUY";

    public static void main(String[] args) {
        System.out.println(getVowels("Ask Questhion"));
    }

    public static int getVowels(String str) {
        int count = 0;

        if (str.isEmpty()) {
            return count;
        }

        for (int i = 0; i < str.length(); i++) {
            char sym = str.charAt(i);
            if (VOWELS.indexOf(sym) != -1) {
                count++;
            }
        }
        return count;
    }


}
