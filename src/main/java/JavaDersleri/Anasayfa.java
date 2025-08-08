package JavaDersleri;

import java.util.Arrays;

public class Anasayfa {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int day = 1;

        if (day == 1) {
           System.out.println("Bugün Pazartesi");
       } else if (day == 3) {
           System.out.println("Bugün Salı");
       } else if (day == 5) {
           System.out.println("Bugün Cuma");
       } else {
           System.out.println("Bugün O Gün Değil...");
       }

        //Komut doğru fakat çok fazla kod yazmak gerekiyor bu da görüntü kirliliğine neden açıyor..

        switch (day) {
            case 0:
                System.out.println("Bugün Pazartesi");
                break;
            case 2:
                System.out.println("Bugün Çarşamba");
                break;
            case 4:
                System.out.println("Bugün Perşembe");
                break;

            default:
                System.out.println("Bugün o Gün!!");

                //Komut doğru fakat yukarıdaki komuttan tek artısı daha okunur ve düzenli..

        }
    }
}
