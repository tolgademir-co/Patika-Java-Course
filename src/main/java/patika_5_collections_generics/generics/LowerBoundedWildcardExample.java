package patika_5_collections_generics.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcardExample {

    public static void add(List<? super Integer> list) {
        list.add(1);
        list.add(2);

    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        add(numbers);

        System.out.println(numbers);

        List<Double> doubleList = new ArrayList<>();

        // add(doubleList);

    }
}
