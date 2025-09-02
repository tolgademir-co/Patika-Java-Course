package patika_8_lambdas_functional_interfaces._2_functional_interface;

public class FunctionalInterfaceExample3 {

    public static void main(String[] args) {

        Converter celsiusToFahrenheit = celsius -> (celsius * 1.8) + 32;

        celsiusToFahrenheit.printConversion(25);

    }
}
