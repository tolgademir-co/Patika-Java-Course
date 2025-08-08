package patika_3_methods.methods.practices._1_practices;

import java.util.Scanner;

public class PalindromNumberExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Palindrom;
        // 121 -> 121 bu sayı bir PALİNDROM'DUR.
        // 123 -> 321 bu sayı bir PALİNDROM DEĞİLDİR.
        // 1221 -> 1221 bu sayı bir PALİNDROM'DUR.
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            boolean isPalindromNumber = isPalindrom(i);

            if (isPalindromNumber) {
                System.out.println(i + " Bir Palindrom Sayıdır!");
            /** } else {
                System.out.println(i + " Bir Palindrom Sayı Değildir!");
            }*/
            }
        }
    }

    private static boolean isPalindrom(int number) { // bu 29 ile 39 satır da ki komut 'private' yerine 'protected' vb. olsa her yerde kullanılır başka başka komut yazmaya gerek yok..

        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number /= 10; // BAŞKA BİR ÖRN: number = number / 10;
        }

        return originalNumber == reversedNumber;
    }
}