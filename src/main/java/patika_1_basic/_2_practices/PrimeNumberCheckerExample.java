package patika_1_basic._2_practices;

import java.util.Scanner;

public class PrimeNumberCheckerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz: ");

        int number = scanner.nextInt();

        //asal sayı 17 asaldır, 9 asal değildir.

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(number + " Bir Asal Sayıdır!");
        }else {
            System.out.println(number + " Bir Asal Sayı Değildir!");
        }
    }
}