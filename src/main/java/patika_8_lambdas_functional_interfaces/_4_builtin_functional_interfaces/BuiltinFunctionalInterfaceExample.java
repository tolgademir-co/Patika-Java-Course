package patika_8_lambdas_functional_interfaces._4_builtin_functional_interfaces;

import java.time.Instant;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.function.*;

public class BuiltinFunctionalInterfaceExample {

    public static void main(String[] args) {

        //Supplier :
        Supplier<LocalDate> localDateSupplier = LocalDate::now; // method reference yöntemi
        Supplier<LocalDate> lambdaSupplier = () -> LocalDate.now(); // lambda ile yazılmış hali

        LocalDate localDate = localDateSupplier.get();
        LocalDate localDate1 = lambdaSupplier.get();

        System.out.println(localDate);
        System.out.println(localDate1);

        //Consumer :

        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Patika");

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> integerBiConsumer = map::put;
        integerBiConsumer.accept("Patika", 7);
        integerBiConsumer.accept("Patika.dev", 13);

        System.out.println(map);

        //Predicate - BiPredicate :

        Predicate<String> stringPredicate = String::isEmpty;
        System.out.println(stringPredicate.test(""));
        System.out.println(stringPredicate.test("patika"));
        System.out.println();

        BiPredicate<String, String> stringBiPredicate = String::startsWith;
        System.out.println(stringBiPredicate.test("chicken", "chi"));
        System.out.println(stringBiPredicate.test("chicken", "patika"));
        System.out.println();

        // Function - BiFunction :

        Function<String, Integer> stringIntegerFunction = String::length;
        Function<String, Integer> lambdaFunction = x -> x.length();

        System.out.println(stringIntegerFunction.apply("patika.dev"));
        System.out.println(lambdaFunction.apply("Patika.dev"));
        System.out.println();

        BiFunction<String, String, String> stringBiFunction = String::concat;
        System.out.println(stringBiFunction.apply("patika", ".dev"));


    }
}
