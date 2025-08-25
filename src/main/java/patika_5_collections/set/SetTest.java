package patika_5_collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");    // 63476538
        fruits.add("Banana");   // 1982479237
        fruits.add("Orange");   // -1924984242

        fruits.add("Apple"); // Set '2'inci' bir değeri görmezden gelir -- LinkedList'deki gibi 2 değer girdiğinde ekrana yazdırmaz-
        fruits.add(null); // HashSet 'null' değerini kabul eder--

        System.out.println("Apple kelimesinin hashCode karşılığı: " + "Apple".hashCode());
        System.out.println("Banana kelimesinin hashCode karşılığı: " + "Banana".hashCode());
        System.out.println("Orange kelimesinin hashCode karşılığı: " + "Orange".hashCode());
        System.out.println();

        System.out.println("Fruits: " + fruits);
        System.out.println();


        // LinkedHashSet --

        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("İzmir");
        cities.add("İstanbul");

        System.out.println("Cities: " + cities);
        System.out.println();

        // TreeSet --> Sıralama yapabilir && Metin girersen 'Alfabetik' sıralar

        Set<Integer> numbers = new TreeSet<>(); // Küçük'ten Büyü'ye sıraladı ÇIKTISI: 5, 10, 15, 20

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        System.out.println("Numbers: " + numbers);
        System.out.println();

        Set<String> cars = new TreeSet<>(); // Alfabetik sıraya göre sıraladı ÇIKTISI: AUDİ, BMW, BUGATTİ, MERCEDES

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Bugatti");

        System.out.println("Cars: " + cars);
        System.out.println();

        cars.remove("Audi"); // Audi metini silmeye yarar-- sıranın neresinde olursa olsun sildikten sonra yine alfabetik sıraya göre satır satır çıktısını verir--

        System.out.println("Cars: " + cars);

        System.out.println("Size: " + cars.size()); // KAÇ TANE SİZE(DEĞER) YAZILDIĞINI GÖSTERİR ** SİLİNENLER HARİÇ

        cars.clear(); // Bütün (Set)değerleri siler -- sonra isEmpty metot'u ile true && false değerini yazdırman lazım

        System.out.println("Cars: " + cars);

        System.out.println(cars.isEmpty());


    }
}
