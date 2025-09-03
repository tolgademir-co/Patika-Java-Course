package patika_9_streams._1_optional;

import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        String name = null; // #1

        String name1 = "Patika"; // #2

        Book book = null;

        System.out.println(name1.length());

        //System.out.println(book.getName());

        Optional<String> stringOptional = Optional.of("patika.dev");

        System.out.println(stringOptional.get());

        Optional<String> optionalName = Optional.ofNullable(name); // name içerisinde null değer olduğu için false aldı  -- #1
        System.out.println(optionalName.isPresent());
        System.out.println();

        Optional<String> optionalName1 = Optional.ofNullable(name1); // name1 içerisinde "Patika" değer olduğu için yani bir değer olduğu için true aldı  -- #2
        System.out.println(optionalName1.isPresent());
        System.out.println();

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.isPresent());
        System.out.println();

        //---------

        Optional<String> stringOptional1 = Optional.ofNullable("patika.dev");

        if (stringOptional1.isPresent()) {
            System.out.println("Bir değer var! " + stringOptional1.get());
        } else {
            System.out.println("Değer yok! ");
            System.out.println();
        }

        if (emptyOptional.isPresent()) {
            System.out.println("Bir değer var! " + stringOptional1.get());
        } else {
            System.out.println("Değer yok!");
            System.out.println();
        }

        stringOptional1.ifPresent(name2 -> System.out.println("Değer var! " + name2));
        System.out.println();

        //orElse

        String result = Optional.ofNullable(name).orElse("Bilinmeyen kullanıcı");
        System.out.println(result);

        System.out.println();

        String result1 = Optional.ofNullable(name).orElseGet(() -> "Bilinmeyen Kullanıcı"); // .of() → hazır, kısa ve güvenli nesne oluşturma metodu.
        System.out.println(result1);

        System.out.println();

        //String result2 = Optional.ofNullable(name).orElseThrow(() -> new IllegalArgumentException("Kullanıcı Bulunamadı!"));

        //----------------

        List<String> names = List.of("Mehmet", "Ayşe", "Veli", "Ali", "Ahmet");
        Optional<String> ahmet = names.stream()
                .filter(name3 -> name3.startsWith("A"))
                .findAny(); // .findAny() → Stream’deki herhangi bir elemanı (ilk olmak zorunda değil) Optional olarak döndürür.

        System.out.println(ahmet.get());

        Optional<String> ahmet1 = names.stream()
                .filter(name3 -> name3.startsWith("A")) // .filter(), stream içindeki elemanları verilen şarta (predicate) uyanlarla sınırlandırır.
                .findFirst(); // .findFirst() → Stream’deki ilk elemanı Optional olarak döndürür.

        System.out.println(ahmet1.get());

        // Map

        List<Integer> list = names.stream()
                .map(String::length)
                .toList();

        System.out.println(list);
    }
}
