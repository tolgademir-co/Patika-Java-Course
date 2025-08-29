package patika_5_collections_generics.collections.map;

import java.util.HashMap;
import java.util.Map;

public class BookMapExample {

    public static void main(String[] args) {
        Map<String, Book> bookMap = new HashMap<>();

        bookMap.put("ISBN123", new Book("Claean Code", "Robert C. Martin"));
        bookMap.put("ISBN456", new Book("Effective Java", "Jasua Bloch"));

        for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

        }
    }
}
