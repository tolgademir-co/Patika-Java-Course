package patika_3_methods;

public class MethodTest {

    public static void main(String[] args) {

        //double sum1 = addNumbers(5, 7); HATALI ÇÜNKÜ GERİ DÖNÜŞ DEĞERİ YOK--

        //addNumbers(5, 7);

        //double sum = addNumbers(6.4, 15);

        //System.out.println("Toplam: " + sum);

        Calculation calculation = new Calculation();
        calculation.showTitle();

        int square = calculation.calculateSquare(5);
        System.out.println("Square: " + square);

        calculation.addNumbers(5, 6);

        double addedNumbers = calculation.addNumbers();

        System.out.println(addedNumbers);

        calculation.addNumbers1();

    }
}
