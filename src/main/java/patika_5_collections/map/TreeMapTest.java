package patika_5_collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<Integer, String> numbers = new TreeMap<>();

        numbers.put(3, "Three");
        numbers.put(1, "One");
        numbers.put(2, "Two");

        System.out.println("Numbers: " + numbers);

        System.out.println("First Key: " + numbers.firstKey());

        System.out.println("Last Key: " + numbers.lastKey());

        boolean containsKey = numbers.containsKey(4);

        System.out.println(containsKey);

        System.out.println();

        // Ters sıralı anahtarları yazdırma--
        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }


    }
}
