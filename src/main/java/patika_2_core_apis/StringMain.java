package patika_2_core_apis;

public class StringMain {

    public static void main(String[] args) {
        var s = "Lavanta";

        String flower = "Papatya"; // 7 Karakterden oluşur. String'ler 0'cı İndexten Başlar

        int length = flower.length();

        System.out.println(flower + " -> " + length + " Karakter'den Oluşmaktadır.");

        char firstIndex = flower.charAt(0);

        System.out.println(firstIndex);

        //char c = flower.charAt(7); // StringIndexOutOfBoundsException HATASI VERİYOR ÇÜNKÜ STRİNG "PAPATYA" ZATEN 7 RAKAMLI BİR KARAKTER..

        System.out.println(flower.indexOf('a'));

        System.out.println(flower.indexOf('a', 2));

        System.out.println(flower.substring(3));

        System.out.println(flower.substring(2, 5));

        //System.out.println(flower.substring(5, 2)); // StringIndexOutOfBoundsException

        System.out.println(flower.toUpperCase());  // STRİNG DEKİ "PAPATYA" KELİMESİNİN HEPSİNİ BÜYÜK HARFE ÇEVİREN KOMUT SATIRI--

        System.out.println(flower.toLowerCase()); // STRİNG DEKİ "PAPATYA" KELİMESİNİN HEPSİNİ KÜÇÜK HARFE ÇEVİREN KOMUT SATIRI--

        System.out.println("Lavanta".equals(flower)); // YUKARIDAKİ STRİNG METHODUN DAKİ DEĞERİ KONTROL EDİYOR BU SATIR--

        System.out.println("papatya".equals(flower)); // YUKARIDAKİ STRİNG METHODUN DAKİ DEĞERİ KONTROL EDİYOR BU SATIR--

        System.out.println("papatya".equalsIgnoreCase(flower)); // BÜYÜK VE KÜÇÜK HARFLERE BAKMADAN KARŞILAŞTIRMA YAPIYOR BU KOMUT SATIRI--

        System.out.println();

        System.out.println(flower.startsWith("Papa")); // ELİMDEKİ STRİNG DEĞERİNİN "" İÇİNDE VERDİĞİM DEĞERLE BAŞLAYIP BAŞLAMADIĞINI KONTROL EDİYOR BU SATIR--

        System.out.println(flower.endsWith("t")); // ELİMDEKİ STRİNG DEĞERİNİN "" İÇİNDE VERDİĞİM DEĞERLE BİTİYOR MU DİYE KONTROL EDİYOR BU SATIR--

        System.out.println(flower.endsWith("a")); //ELİMDEKİ STRİNG DEĞERİNİN "" İÇİNDE VERDİĞİM DEĞERLE BİTİYOR MU DİYE KONTROL EDİYOR BU SATIR--

        System.out.println(flower.endsWith("ya")); // ELİMDEKİ STRİNG DEĞERİNİN "" İÇİNDE VERDİĞİM DEĞERLE BİTİYOR MU DİYE KONTROL EDİYOR BU SATIR--

        System.out.println();

        System.out.println("flower".contains("f")); // BU KOMUT FLOWER METHODUNUN İÇERİSİNDEKİ HARFLERİ KONTROL EDİYOR !!

        System.out.println("flower".contains("w")); // BU KOMUT FLOWER METHODUNUN İÇERİSİNDEKİ HARFLERİ KONTROL EDİYOR !!

        System.out.println("flower".contains("pa")); // BU KOMUT FLOWER METHODUNUN İÇERİSİNDEKİ HARFLERİ KONTROL EDİYOR !!

        System.out.println("flower".contains("flower")); // BU KOMUT FLOWER METHODUNUN İÇERİSİNDEKİ HARFLERİ KONTROL EDİYOR !!

        System.out.println();

        System.out.println(flower.replace('t', 'T')); // BU KOMUT STRİNG METHODUNUN "" İÇİNDE PAPATYA YAZAYAN İÇERİĞİN İÇİNDEKİ HER HANGİ BİR HARFİ KÜÇÜK TEN BÜYÜYE ÇEVİRİYOR--

        System.out.println(flower.replace('a', 'A')); // ÜST SATIRDAKİ 62 SATIR AYNI KOMUT

        System.out.println(flower.replace('A', 'a')); //  BU KOMUT STRİNG DEĞERİNİN İÇİNDEKİ HARFİ BÜYÜK İSE KÜÇÜĞE ÇEVİRİYOR--

    }
}
