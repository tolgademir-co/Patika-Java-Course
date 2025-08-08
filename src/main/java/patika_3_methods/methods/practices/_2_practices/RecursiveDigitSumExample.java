package patika_3_methods.methods.practices._2_practices;

import java.util.Scanner;

public class RecursiveDigitSumExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 123 -> 1 + 2 + 3 = 6

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int sum = sumOfDigits(number);

        System.out.println(number + " Basamak Toplamı: " + sum);
    }

    private static int sumOfDigits(int number) {

        if (number == 0) return 0;

        return (number % 10) + sumOfDigits(number / 10);
    }
}
