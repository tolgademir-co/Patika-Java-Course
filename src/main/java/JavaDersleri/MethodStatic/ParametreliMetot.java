package JavaDersleri.MethodStatic;

public class ParametreliMetot {

    // 1. PARAMETRESİZ VE GERİYE DEĞER DÖNDÜRMEYEN METOT TANIMLAMA.
    // 2. PARAMETRELİ VE GERİYE DEĞER DÖRDÜRMEYEN METOT TANIMLAMA.

    // KULLANICI 2 TANE SAYI GİRSİN VE 2 SAYI TOPLA EKRANA GÖNDER--

    public static void main(String[] args) {
        // 1.
        isimYazdır();

        topla(15, 5);
        isimSoyisimYazdır("Tolga", "DEMİR");

    }

    public static void isimSoyisimYazdır(String isim, String Soyisim) {
        System.out.println("İsim ve Soyisim: " + (isim + " " + Soyisim));
    }

    public static void topla(int sayi1, int sayi2) {

        int toplam = sayi1 + sayi2;
        System.out.println("Toplam: " + toplam);


    }

    public static void isimYazdır() {
        // 1.
        System.out.println("TOLGA");
    }
}
