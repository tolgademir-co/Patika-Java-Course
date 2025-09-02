package patika_8_lambdas_functional_interfaces._2_functional_interface;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        MathOperation sum = (number1, number2) -> number1 + number2;
        MathOperation multiply = (a, b) -> a * b;

        //var multiply2 = (a, b) -> a * b;

        System.out.println("Toplam: " + sum.operate(2, 5));
        System.out.println("Çarpma: " + multiply.operate(3,6));


    }
}
