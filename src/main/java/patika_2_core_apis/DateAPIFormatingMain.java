package patika_2_core_apis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAPIFormatingMain {

    // DateAPI lerin FORMATLAMA METHODU

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;

        System.out.println(today.format(dateTimeFormatter));

        System.out.println(today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // 23 satırdaki KOMUTA GÖRE DOĞRU KULLANIM ŞEKLİ BU ŞEKİLDEDİR 'M' BÜYÜK OLUCAK. GÜN&AY&YIL ŞEKLİNDE--

        //System.out.println(today.format(DateTimeFormatter.ofPattern("dd/mm/yyyy"))); // BÜYÜK M: AY & küçük m: DAKİKA -- DAKİKA BİLGİSİ OLMADIĞI İÇİN KOMUT HATALI--

        String stringDate = "25/01/2026"; // BU METHOD BİR YIL SONRAYA BİR DATE OLUŞTURMAYA YARIYOR--

        System.out.println();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate localDate = LocalDate.parse(stringDate, formatter); // DATE METHODUNU ÇEVİRMEK İSTEMEYE YARIYOR--

        System.out.println("İleri Tarih: " + localDate);

        System.out.println("İleri Tarih: " + LocalDate.parse("2025-03-23")); // .parse -- ISO_LOCAL_DATE FORMATINDA AYNI 'YIL&AY&GÜN' OLDUĞU İÇİN KOMUT ÇALIŞIR--

        // System.out.println("İleri Tarih: " + LocalDate.parse("23/03/2027")); ISO_LOCAL_DATE * FORMATINDA OLMADIĞI İÇİN HATA ALIR--

        System.out.println();

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        System.out.println(now.format(dateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))); // ÇIKTISI: TARİH- GÜN & AY & YIL 'BOŞLUK' SAAT- SAAT & DAKİKA & SANİYE OLARAK GÖSTERİR

        System.out.println(now.format(dateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))); // ÇIKTISI: TARİH- GÜN & AY & YIL 'BOŞLUK' SAAT- SAAT & DAKİKA OLARAK GÖSTERİR

        System.out.println();

        String stringDateTime = "25-02-2026 16:05:55";

        System.out.println(LocalDateTime.parse(stringDateTime, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));

        System.out.println();

        LocalDateTime localDateTimeAustralia = ZonedDateTime.now(ZoneId.of("Australia/Sydney")).toLocalDateTime(); // AUSTRALİA/SYDNEY EYALETİNDEKİ GÜNCEL TARİH&SAATİ GÖSTERİYOR--

        System.out.println("Australia: " + localDateTimeAustralia); // AUSTRALİA/SYDNEY TARİH&SAAT ÇIKTISI..


    }
}
