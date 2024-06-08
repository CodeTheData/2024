package Codewars;

public class String_exr {
    public static void main(String[] args) {
        System.out.println(getCountV2("Artemy Hello"));
    }

    public static int getCount(String str) {

        char vowel = 'a';
        int count = 0;

        for (int i = str.length(); i >= 0; i--) {
            if (str.contains(String.valueOf(vowel))) {
                count += 1;
            }
        }

        if (count > 0) {
            System.out.println("Nope!" + count);
        } else {
            System.out.println("Yep!" + count);
        }
        return count;
    }

    public static int getCountV2 (String str) {
        char[] array = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < array.length; j++) {
                if (str.charAt(i) == array[j]) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
