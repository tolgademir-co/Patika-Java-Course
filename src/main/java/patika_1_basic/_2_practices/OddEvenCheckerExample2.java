package patika_1_basic._2_practices;

import java.util.Scanner;

public class OddEvenCheckerExample2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Bir Çift Sayıdır!");
            }else {
                System.out.println(i + " Bir Tek Sayıdır!");
            }
        }
    }
}
