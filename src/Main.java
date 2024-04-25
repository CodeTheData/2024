//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                //1*
                byte a = 11;
                byte b = 5;

                //2*
                //short a = 11;
                //short b = 3;

                //3*
                //int a = 113;
                //int b = 5;

                //4*
                //long a = 100000;
                //long b = 50000;

                //5*
                //float a = 24.3f;
                //float b = 19.8f;

                //5*
                //double a = 24.3d;
                //double b = 19.8d;

                //7*
                //char a = 49;
                //char b = 38;



                //#1 Сумма ____ в переменную с типом byte
                byte sum1 = (byte) (a + b);
                byte sum1_ = (byte) (a - b);
                byte sum1__ = (byte) (a * b);
                byte sum1___ = (byte) (a / b);
                byte sum1____ = (byte) (a % b);
                System.out.println(sum1 + " " + sum1_ + " " + sum1__ + " " + sum1___+ " " + sum1____); //possible lossy conversion from int to byte


        /*#1.1 Сумма ____ в переменную с типом short
        short sum2 = (short) (a + b);
        short sum2_ = (short) (a - b);
        short sum2__ = (short) (a * b);
        short sum2___ = (short) (a / b);
        short sum2____ = (short) (a % b);
        System.out.println(sum2 + " " + sum2_ + " " + sum2__ + " " + sum2___ + " " + sum2____); // possible lossy conversion from int to short
        */

        /*#1.2 Сумма ____ в переменную с типом long
        long sum3 = a + b;
        long sum3_ = a - b;
        long sum3__ = a * b;
        long sum3___ = a / b;
        long sum3____ = a % b;
        System.out.print(sum3 + " " + sum3_ + " " + sum3__ + " " + sum3___ + " " + sum3____); // Все выдает корректно, т.к диапазон значений long > int
        */

        /*#1.4 Сумма интов в переменную с типом char
        char sum5 = (char) (a + b);
        char sum5_ = (char) (a - b);
        char sum5__ = (char) (a * b);
        char sum5___ = (char) (a / b);
        char sum5____ = (char) (a % b);
        System.out.print(sum5 + " " + sum5_ + " " + sum5__ + " " + sum5___ + " " + sum5____); //возможное преобразование с потерями из int в char
        */

        /*#1.5 Сумма интов в переменную с типом float
        float sum6 = a + b;
        float sum6_ = a - b;
        float sum6__ = a * b;
        float sum6___ = a / b;
        float sum6____ = a % b;
        System.out.print(sum6 + " " + sum6_ + " " + sum6__ + " " + sum6___ + " " + sum6____); // Все выдает корректно
        */

        /*#1.6 Сумма ____ в переменную с типом double
        double sum7 = a + b;
        double sum7_ = a - b;
        double sum7__ = a * b;
        double sum7___ = a / b;
        double sum7____ = a % b;
        System.out.print(sum7 + " " + sum7_ + " " + sum7__ + " " + sum7___ + " " + sum7____); // Все выдает корректно
        */

        /*#1.7 Сумма ____ в переменную с типом int
        int sum8 = (int) (a + b);
        int sum8_ = (int) (a - b);
        int sum8__ = (int) (a * b);
        int sum8___ = (int) (a / b);
        int sum8____ = (int) (a % b);
        System.out.print(sum8 + " " + sum8_ + " " + sum8__ + " " + sum8___ + " " + sum8____); // Все выдает корректно
        */

        /*#1.8 Сумма ______ в переменную с типом boolean
        boolean sum9 = a + b;
        boolean sum9_ = a - b;
        boolean sum9__ = a * b;
        boolean sum9___ = a / b;
        boolean sum9____ = a % b;
        System.out.print(sum9 + " " + sum9_ + " " + sum9__ + " " + sum9___ + " " + sum9____); // Все выдает корректно
        */

    }
}