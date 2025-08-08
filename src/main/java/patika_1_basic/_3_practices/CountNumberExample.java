package patika_1_basic._3_practices;

import java.util.Scanner;

public class CountNumberExample {

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

        System.out.println("Aramak İstediğiniz Sayıyı Giriniz: ");
        int number = scanner.nextInt();

        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == number) {
                counter++;

                // counter = counter + 1;
                // counter +=1
            }

        }
        System.out.println("Aradığım Sayıdan " + counter + " Adet vardır.");
    }
}
