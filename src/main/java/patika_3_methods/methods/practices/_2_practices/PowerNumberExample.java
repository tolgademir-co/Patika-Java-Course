package patika_3_methods.methods.practices._2_practices;

import java.util.Scanner;

public class PowerNumberExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Recursice ÜS ALMA

        // 2 ^3 -> 2 * 2 * 2 = 8

        System.out.print("Taban Değeri Giriniz: ");
        int base = scanner.nextInt();

        System.out.print("Üs Değerini Giriniz: ");
        int power = scanner.nextInt();

        int result = power(base, power);
        System.out.println();
        System.out.println(base + " ^ " + power + " = " + result);

    }

    private static int power(int base, int power) {

        if (power == 0) return 1;
        return base * power(base, power - 1); // 2 * (power( 2 * (power) * 1))
    }
}