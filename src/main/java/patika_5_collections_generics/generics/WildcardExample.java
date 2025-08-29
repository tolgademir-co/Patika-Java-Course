package patika_5_collections_generics.generics;

import java.util.List;

public class WildcardExample {

    public static void main(String[] args) {
        List<Integer> integersList = List.of(1, 2, 3);
        List<String> stringList = List.of("Java", "Python");

        print(integersList);
        print(stringList);
    }

    private static void print(List<?> list) {

        for (Object object : list) {
            System.out.println(object);
        }
    }
}
