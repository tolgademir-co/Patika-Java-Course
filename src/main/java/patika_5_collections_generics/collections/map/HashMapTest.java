package patika_5_collections_generics.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        Map<String,Integer> student = new HashMap<>();
        student.put("Ali", 85);
        student.put("Ayşe", 90);
        student.put("Emir", 75);

        System.out.println("Students: " + student);

        System.out.println("Ayşe'nin notu: " + student.get("Ayşe"));

        System.out.println("Keys: " + student.keySet());

        System.out.println("Values: " + student.values());

        student.remove("Cem");

        student.put("Cem", 55);

        System.out.println("Students: " + student);

        student.remove("Cem");

        System.out.println("Students: " + student);

    }
}
