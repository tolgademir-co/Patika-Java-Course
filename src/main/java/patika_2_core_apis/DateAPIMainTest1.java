package patika_2_core_apis;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAPIMainTest1 {

    //LOCAL DATE İLE TARİH İŞLEMLERİ ÖRN:

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2025, 2, 21);
        System.out.println("Bir Hafta Sonra: " + date.plusDays(7));
        System.out.println("Bir Ay Sonra: " + date.plusMonths(1));
        System.out.println("Bir Yıl Sonra:" + date.plusYears(1));
        System.out.println("Bir Hafta'nın Günü: " + date.getDayOfMonth()); // FRIDAY--

    }
}
