package patika_1_basic.arrays;

public class ArrayTest {

    public static void main(String[] args) {


        int number = 5;
        int number1 = 10;
        int number2 = 15;

        int[] numbers = new int[5]; // ELEMAN SAYISI
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;    // ARRAY ATAMA DEĞER KOMUT SATIRI-- 1 ÖRNEK & AYNI KOD
        numbers[3] = 20;
        numbers[4] = 25;

        // numbers[7] = 30; array index out of bound hatası.

        for (int i = 0; i < numbers.length; i++) {
            //System.out.println("number[" + i + "] = " + numbers[i]); // AYNI YAZDIRMA KOMUT SATIRI -- ÖRNEK 1
        }

        // System.out.println("number[" + 5 + "] = array index out of bound hatası.

        int [] numbers2 = {1,2,3,4,5}; // ARRAY ATAMA DEĞER KOMUT SATIRI-- 2 ÖRNEK & AYNI KOD

        for (int num: numbers2) {
            System.out.println(num);
            //System.out.println(num); // AYNI YAZDIRMA KOMUT SATIRI -- ÖRNEK 2
        }


            String cities[] = {"İstanbul", "Ankara", "İzmir", "Bursa", "Balıkesir"}; // İKİSİDE ARRAY TANIMI
            String[] cities1 = {"İstanbul", "Ankara", "İzmir", "Bursa", "Balıkesir"}; // İKİSİDE ARRAY TANIMI & AMA BU DAHA ÇOK KULLANIŞLI BİR ARRAY TANIMI--

            for (String city : cities) {
                System.out.println(city);
            }


    }
}
