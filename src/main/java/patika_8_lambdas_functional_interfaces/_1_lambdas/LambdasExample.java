package patika_8_lambdas_functional_interfaces._1_lambdas;

public class LambdasExample {

    public static void main(String[] args) {

        // Java 8 öncesi

        Greeting greeting = new Greeting() {
            @Override
            public void method(String string) {
                System.out.println("Hello " + string);

            }
        };

        greeting.method("cem");

        // Java 8 sonrası

        Greeting greeting1 = (name) -> System.out.println("Hello " + name); // ÖRN-1
        Greeting greeting2 = name -> {                                      // ÖRN-2
            System.out.println("Hello " + name);
            System.out.println("Ben bir lambda methodum");

        };
        greeting1.method("cem");
        greeting2.method("cem");

        // Lambdas
        // (parametre) -> {methodGövdesi}
        // eğer tek parametre varsa parametre -> methodGövdesi =     Greeting greeting1 = name -> System.out.println("Hello " + name);

    }
}
