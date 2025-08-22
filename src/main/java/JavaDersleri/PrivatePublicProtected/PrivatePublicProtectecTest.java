package JavaDersleri.PrivatePublicProtected;

public class PrivatePublicProtectecTest {

    public static void main(String[] args) {

        // Bir sınıf var. Biz bir sınıfın içindeki değişkenlere erişebilmek için
        //o classtan nesne türetmemiz gerekiyor. new

        // Constructor (yapıcı metot)

        /*
        ERİŞİM BELİRLEYİCİLERİ (ACCESS MODİFİERS)
        * public    : her yerden erişilebilir kısıtlama yok.
        * private   : sadece bulunduğu class içerisinden erişilebilir.
        * protected : bulunduğu class içinden ve o class'ın miras alan alt classlardan erişilebilir.
         */

        PrivatePublicProtectecOgrenci privatePublicProtectecOgrenci1 = new PrivatePublicProtectecOgrenci("Erkek");

        privatePublicProtectecOgrenci1.id = 5;
        privatePublicProtectecOgrenci1.isim = "Tolga";
        privatePublicProtectecOgrenci1.soyisim = "Demir";


        System.out.println("Öğrencinin Bilgileri");
        System.out.println("İD: " + privatePublicProtectecOgrenci1.id);
        System.out.println("İsim: " + privatePublicProtectecOgrenci1.isim);
        System.out.println("Soyisim: " + privatePublicProtectecOgrenci1.soyisim);
        privatePublicProtectecOgrenci1.cinsiyetYazdir();

    }
}
