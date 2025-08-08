package patika_1_basic._3_practices;

import java.util.Scanner;

public class MinMaxFinderExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç Elemanlı Bir Dizi Girmek İstiyorsunuz: ");

        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println(size + " Adet Sayı Giriniz: ");

        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". Sayıyı Giriniz: ");
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("En Büyük Sayı = " + max);
        System.out.println("En Küçük Sayı = " + min);
    }
}
