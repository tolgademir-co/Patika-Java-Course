package JavaDersleri.MethodStatic;

import java.util.Scanner;

public class Metotlar2 {

    public static void ortalamaAl(int sayi1, int sayi2){
        int toplam = sayi1 + sayi2;
        double ortalama = toplam / 2;
        System.out.println(ortalama);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci Sayıyı Giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.println("İkinci Sayıyı Giriniz:");
        int sayi2 = scanner.nextInt();

        ortalamaAl(sayi1, sayi2);

        /*
        // TEK && ÇİFT SAYILARIN TOPLAMI'NIN YARISNI EKRANA VERİR--
        ortalamaAl(40,50);

        ortalamaAl(70, 20);

        ortalamaAl(420, 750);

        ortalamaAl(88, 1009);

        ortalamaAl(41,57);

         */


    }
}
