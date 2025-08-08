package patika_2_core_apis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAPIMainTest2 {

    // TARİH & SAAT FORMATLAMA

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // GÜN & AY & YIL ve SAAT & DAKİKA & SANİYE -- OLARAK SİSTEME KAYIT EDİLDİ--

        String formattedDate = now.format(formatter);
        System.out.println("Formatlı Tarih & Saat: " + formattedDate); // ÇIKTI VE ÇIKTINIZ VERİ ALICAĞI METHOD YAZILDI--

    }
}
