package Codewars;

public class Car_Numbers {
    public static void main(String[] args) {
        char[] letters = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int count = 0;

        for (int i = 0; i < letters.length ; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = 0; k < numbers.length; k++) {
                    for (int l = 0; l < numbers.length; l++) {
                        for (int m = 0; m < letters.length; m++) {
                            for (int n = 0; n < letters.length; n++) {
                                System.out.print(letters[i]);
                                System.out.print(numbers[j]);
                                System.out.print(numbers[k]);
                                System.out.print(numbers[l]);
                                System.out.print(letters[m]);
                                System.out.print(letters[n] + "\n");
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
