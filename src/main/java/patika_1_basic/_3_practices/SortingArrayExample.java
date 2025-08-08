package patika_1_basic._3_practices;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayExample {

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

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
