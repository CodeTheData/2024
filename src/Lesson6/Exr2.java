package Lesson6;

import com.sun.source.tree.CompilationUnitTree;

/**
 * Возвращает количество (количество) гласных в заданной строке.
 *
 * Мы будем рассматривать , , , как гласные для этого ката (но не ).'a' 'e' 'i' 'o' 'u' 'y'
 *
 * Входная строка будет состоять только из строчных букв и/или пробелов.
 */

public class Exr2 {

    //static final char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
    static final String VOWELS = "aeiouyAEIOUY";

    public static void main(String[] args) {
        System.out.println(getVowel("   "));
    }

    public static int getVowel(String str) {
        int count = 0;

        if (str.replace(" ", "").length() == 0) {
            return count;
        }

        System.out.println(1);

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < VOWELS.length(); j++) {
                if (str.charAt(i) == VOWELS.charAt(j)){
                    count += 1;
                }
            }
        }
        return count;
    }



}
