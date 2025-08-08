package patika_2_core_apis;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAPIMain {

    public static void main(String[] args) {

        System.out.println(LocalDateTime.now()); // ANLIK OLARAK ŞUANIN SAAT&TARİH&SANİYEYİ GÖRMEYE YARIYOR

        System.out.println(LocalDate.now()); // SADECE O GÜNÜ TARİHİNİ VERİR == YIL&AY&GÜN ŞEKLİNDE

        System.out.println();

        System.out.println(LocalDate.now().plusDays(30)); // BU METHOD 30 GÜNLÜK BİR PAKET OLUŞTURUR ÖRN: ÜYELİK PAKETİ SATTIN 30 GÜNLÜK SANA BİTİŞ TARİHİNİ VERİR--

        System.out.println(LocalDate.now().plusMonths(3)); // BU METHOD DA 3 AYLIK BİR PAKET OLUŞTURUR ÖRN: ÜYELİK PAKETİ SATTIN 3 AYLIK PAKET OLUŞTURUR BİTİŞ TARİHİNİ VERİR--

        System.out.println(LocalDate.now().plusYears(1)); // YUKARI DA Kİ METHODLARLA AYNI BU SEFERDE YILLIK PAKET OLUŞTURUYOR--

        System.out.println();
        // BİR BİTİŞ TARİHİ && DOĞUM GÜNÜNÜZÜ EKLEMEK İSTİYORSUNUZ SENERYO: ETKİNLİK OLABİLİR VEYA SİSTEM O TARİHTE GÜNCELLEME OLUCAK GİBİ GİBİ
        var date = LocalDate.of(2033, 8, 5);

        System.out.println(date);

        System.out.println();

        System.out.println(LocalDate.now().minusDays(5)); // BU METHOD KURDUĞUNUZ GÜNCEL SENERYODAN 5' GÜN ÇIKARIR--

        System.out.println(LocalDate.now().minusYears(5)); // BU METHOD KURDUĞUNUZ GÜNCEL SENERYODAN 5'YIL ÇIKARIR--

        System.out.println();

        var expireDate = LocalDate.of(2025, 8, 2);

        boolean isBefore = expireDate.isBefore(LocalDate.now()); // METHOD&DATE ÜZERİNDE KONTROL YAPMAYA YARIYOR--

        if (isBefore) {
            System.out.println("Paketiniz Süresi Dolmuştur!!");
        }

        boolean after = expireDate.plusMonths(5).isAfter(LocalDate.now());
        System.out.println(after);

    }
}
