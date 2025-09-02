package patika_8_lambdas_functional_interfaces._1_lambdas;

public class LambdasExample4 {

    public static void main(String[] args) {

                // Bunlar Örnekler -- bir metot içinde kullanılabilir..
        // () -> true;
        // (String x) -> x.startsWith("test");

        /*(String x, String y) -> {
            System.out.println("Lambdas ifadeleri...");
            return x.startsWith("test1");
        };
         */
        // invalid Lambdas ifadeleri
        // String x, String y -> x.startsWith("test3"); // Bir den fazla parametreler var ise parantezleri unutmayalım

        // String x -> x.startsWith("test4"); // Bir parametre olduğu için paranteze gerek yok..

    }
}
