package patika_5_collections_generics.generics;

public class GenericMethodExample {

    public static <T> void printArray(T[] array) {

        for (T element : array) {
            System.out.println(element);
        }
    }
}
