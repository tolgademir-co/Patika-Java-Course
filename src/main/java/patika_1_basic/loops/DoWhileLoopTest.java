package patika_1_basic.loops;

import java.util.Scanner;

public class DoWhileLoopTest {

    public static void main(String[] args) {
        /*
        boolean isTrue = 1 < 0;


        do {

            System.out.println("Bu döngü en az bir kere çalışır");

        } while (isTrue);
         */


        Scanner scanner = new Scanner(System.in);

        String password = "1234";

        boolean isPasswordFalse = true;

        int counter = 0; // bu satır ekleyince yanlış deneme hakkı veriyorsun kullanıcıya

        do {

            System.out.println("Şifre giriniz: ");
            String input = scanner.nextLine();

            if (password.equals(input)) {
                System.out.println("Doğru bir şifre girdiniz.");
                //isPasswordFalse = false; - 26 SATIR DA Kİ KOD YAZINCA BUNLARA GEREK KALMIYOR
            }else {
                System.out.println("Yanlış bir şifre girdiniz.");
                //isPasswordFalse = true; - 26 SATIR DA Kİ KOD YAZINCA BUNLARA GEREK KALMIYOR
                counter++; // HATALI GİRİŞ SAYISINI BİR ER BİR ER ARTTIRMA KOMUTU
            }

        }while (counter < 3); // BU KOD KULLANICI'NIN KAÇ DEFA HATALI GİRİŞ YAPMABİLME HAKKINA SAHİP OLDUĞUNU BELİRLİYOR '3' SAYISI
    }
}
