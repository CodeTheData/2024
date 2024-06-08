package Codewars;

public class ReversedStrings {

    public static void main(String[] args) {

        System.out.println(reverse("пРИВЕТ"));
        reverseWord("Hello");

    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String reverseWord (String str) {
        char[] array = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
        return str;
    }
}


