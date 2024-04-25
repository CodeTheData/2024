package Lesson3;

/**
 * На вход поступает число месяца, определить какое это время года.
 */

public class Exr_Switch2 {
    public static void main(String[] args) {
        int value = 9;

    /*
    if (value == 12  value == 1  value == 2) {
    System.out.println("Зима");
    } else if (value == 3  value == 4  value == 5) {
    System.out.println("Весна");
    } else if (value == 6  value == 7  value == 8) {
    System.out.println("Лето");
    } else if (value == 9  value == 10  value == 11) {
    System.out.println("Осень");
    } else {
    System.out.println("Месяц введен не корректно");
    }
    */

        switch (value) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месяц введен не корректно!");
        }

    }
}