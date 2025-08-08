package patika_1_basic._2_practices;

import java.util.Scanner;

public class PrimeNumberCheckerExample2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz: ");

        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " sayısı Asal Sayıdır!");
            }else {
                System.out.println(i + " sayısı Asal Değildir!");
            }
        }
    }
}
