package patika_5_collections_generics.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

    public static void main(String[] args) {

        Map<String, String> contires = new LinkedHashMap<>();

        contires.put("TR", "Türkiye");
        contires.put("US", "United States");
        contires.put("DE", "Germany");

        System.out.println("Contries: " + contires);

        contires.remove("DE"); // ALMANYA SİLİNDİ--

        contires.put("FR", "France"); // FRANSA EKLENDİ--

        System.out.println("Contries: " + contires); // TEKRAR'DAN EKRANA YAZDIRILDI--

        System.out.println(); // BİR SATIR BOŞLUK BIRAKIR

        for (Map.Entry<String, String> entry : contires.entrySet()) { // BUDA DAHA KOMPAKT BİR EKRAN YAZDIR KOMUTU
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
