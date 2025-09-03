package patika_9_streams._3_terminal;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperations {

    public static void main(String[] args) {

        List<String> names = List.of("Ali", "Veli", "Ahmet", "Mehmet", "Ali", "Veli");

        System.out.println(names);

        List<String> nameList = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();

        System.out.println(nameList);

        Set<String> uniqueNames = names.stream()
                .collect(Collectors.toSet()); // collect() Stream’deki elemanları liste, set veya başka bir koleksiyona dönüştüren terminal operasyondur.

        System.out.println(uniqueNames);

        //------------

        names.stream()
                .collect(Collectors.toList());


        Map<String, Integer> nameLenghts = uniqueNames.stream()
                .collect(Collectors.toMap(name -> name, String::length)); // length() bir String’in içindeki karakter sayısını döndüren metottur.

        System.out.println(nameLenghts);

        //-------------

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Integer result = numbers
                .stream()
                .reduce(0, Integer::sum); // reduce() Stream’deki elemanları belirli bir işlemle tek bir değer hâline getiren terminal operasyondur.

        System.out.println("Toplam: " + result);

        //------------

        Integer reduce = numbers.stream()
                .reduce(1, (a, b) -> a * b); // reduce() Stream’deki elemanları belirli bir işlemle tek bir değer hâline getiren terminal operasyondur.

        System.out.println(reduce);

        //------------

        Optional<Integer> max = numbers
                .stream()
                .reduce(Integer::max); // reduce() Stream’deki elemanları belirli bir işlemle tek bir değer hâline getiren terminal operasyondur.

        Optional<Integer> min = numbers
                .stream()
                .reduce(Integer::min); // reduce() Stream’deki elemanları belirli bir işlemle tek bir değer hâline getiren terminal operasyondur.

        System.out.println("Max: " + max.get() + " - Min: " + min.get());

        //-----------

        long count = names
                .stream()
                .filter(name -> name.length() > 3)
                .count(); // count() Stream’deki elemanların sayısını döndüren terminal operasyondur.

        System.out.println(count);

        //------------

        List<Integer> numberList = List.of(10, 20, 30, 40, 50);

        boolean allEven = numberList.stream().allMatch(n -> n % 2 == 0); // allMatch() Stream’deki tüm elemanların verilen koşulu sağlayıp sağlamadığını kontrol eden terminal operasyondur.
        System.out.println(allEven);

        boolean anyGreaterThan25 = numberList.stream().anyMatch(n -> n > 25); // anyMatch() Stream’deki elemanlardan en az birinin verilen koşulu sağlayıp sağlamadığını kontrol eden terminal operasyondur.
        System.out.println(anyGreaterThan25);

        boolean noneNegative = numberList.stream().noneMatch(n -> n < 0); // noneMatch() Stream’deki hiçbir elemanın verilen koşulu sağlamadığını kontrol eden terminal operasyondur.
        System.out.println(noneNegative);

    }
}
