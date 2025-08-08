package patika_1_basic.loops;

public class LoopsTest {

    public static void main(String[] args) {
        /**
         *  for
         *  foeach
         *  while
         *  do-while
         */

        int sum = 0;

        for (int i = 1; i < 100; i++) {
            System.out.println(i);
            sum = sum + i;

            System.out.println("toplam" + sum);
        }

        int result = 0;

        for (int j = 0; j <= 1000; j++) { // j++; j = j+1; - Aynı kod ama farklı versiyon yazımıyla daha temiz.

            if (j % 5 == 0 ) {
                System.out.println(j);
                //result = result + j; - Bu değer ile 29 satırdaki değer aynı kod
                result += j; // 28 satırdaki kodla aynıdır. ÖRN:KENDİSİNİ KENDİSİYLE TOPLUYOR..

            }

        }

        System.out.println("5' Bölünen sayıların toplamı: " + result);
    }
}
