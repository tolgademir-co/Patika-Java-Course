package patika_1_basic.loops;

import java.util.Scanner;

public class LoopAndlfExample1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz: ");

        int number = scanner.nextInt();

        if (number > 0 ) {
            System.out.println("Bu sayı Pozitiftir. SAYI = " + number);
        }else if (number < 0) {
            System.out.println("Bu sayı Negatiftir. SAYI = " + number);
        }else {
            System.out.println("Bu sayı 0' Eşittir. SAYI = " + number);
        }
    }
}