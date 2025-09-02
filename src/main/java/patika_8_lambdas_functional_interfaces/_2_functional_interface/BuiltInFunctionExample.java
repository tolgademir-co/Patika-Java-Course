package patika_8_lambdas_functional_interfaces._2_functional_interface;

import java.util.function.Function;

public class BuiltInFunctionExample {

    public static void main(String[] args) {


        Function<String, Integer> lengtFunction = str -> str.length();

        System.out.println("Kelime'nin uzunluğu: " + lengtFunction.apply("Merhaba Patika"));

    }
}
