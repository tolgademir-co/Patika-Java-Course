package patika_3_methods.methods.methods;

public class Calculation {

    double pi = 3.14;

    public void showTitle() {
        System.out.println("Hoş geldiniz!");
    }

    public int calculateSquare(int number) {
        return number * number;
    }

    protected void addNumbers(int number1, int number2) {
        int sum = number1 + number2;

        System.out.println("Toplam: " + sum);
    }

    private double addNumbers(double number1, double number2) {
        double sum = number1 + number2;
        //return number1 + number2;  ** BUDA ÇALIŞIR ÖRNEK FARKLI BİR KOD--
        return sum;
    }

    protected double addNumbers() {
        double pi = 3;
        return 10 * pi;
    }

    protected void addNumbers1() {
        //BOŞ BİR METHOD FAKAT GEÇERLİ BİR METHOD--
        //DİP NOT: BİR METHOD YAZARKEN '{ }' BODY'Sİ OLMAK ZORUNDA--
        System.out.println(10 * pi);
    }


}