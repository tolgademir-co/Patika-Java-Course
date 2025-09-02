package patika_8_lambdas_functional_interfaces._1_lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdasExample2 {

    public static void main(String[] args) {

        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // Java 8 öncesi yazım şekli
        //print(animals, new CheckIfHopper());
        //print(animals, new CheckIfSwim());

        // Java 8 sonrası Lambdas class sayesin
        //print(animals, a -> a.canHop()); // zıplayan hayvanları gösteren print
        //print(animals, a -> a.canSwim()); // yüzebilen hayvanları gösteren print
        print(animals, (a) -> {  // ! ile beraber yüzemeyenleri gösteren print -- aslında doğrudan yine yüzemeyen dediği için zıplayan hayvanları yazdırıyor
            System.out.println("Lambdas ifadeleri");
            return !a.canSwim();
        });

        /**
         * invalid
        var invalid = (Animal animal) -> animal.canHop();

        boolean valid (Animal a) -> return a.canHop();
         */

        // valid
        //CheckTrait checker (Animal a) -> a.canHop();

    }

    private static void print(List<Animal> animalList, CheckTrait checker) {

        for (Animal animal : animalList) {
            if (checker.test(animal)) {
                System.out.print(animal + " ");
            }
        }

        System.out.println();

    }
}
