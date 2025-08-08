package patika_1_basic._2_practices;

import java.util.Scanner;

public class FibonacciSeriesExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int number = scanner.nextInt();

        //Fibonacci -> 0,1,1,2,3,5,8,13,21

        if (number < 1) {
            System.out.println("Lütfen 1 veya daha büyük sayı giriniz: ");
            return;
        }

        int number1 = 0;
        int number2 = 1;

        while (number2 <= number) {
            System.out.println(", " + number2);
            int nextNumber = number1 + number2;
            number1 = number2;
            number2 = nextNumber;
        }
    }
}
