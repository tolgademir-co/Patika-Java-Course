package patika_2_core_apis;

import java.time.LocalDate;

public class DateAPIMainTest {

    // LOCAL DATE NESNESİ OLUŞTURMA ÖRN:

    public static void main(String[] args) {

        LocalDate today = LocalDate.now(); // BUGÜNÜN TARİHİNİ ALIR--
        LocalDate specificDate = LocalDate.of(2031, 1, 1); // BELİRLİ BİR TARİH OLUŞTURUN--

        System.out.println("Bugün'ün Tarini: " + today);
        System.out.println("Belirli Tarih: " + specificDate);
    }
}
