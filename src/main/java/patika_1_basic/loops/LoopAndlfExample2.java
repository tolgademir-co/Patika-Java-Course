package patika_1_basic.loops;

import java.util.Scanner;

public class LoopAndlfExample2 {

    public static void main(String[] args) {

        // 4!(4 Factorial) = 1 x 2 x 3 x 4

        Scanner scanner = new Scanner(System.in);

        System.out.print("Factorial için bir sayı girin: ");

        int number = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;

        }

        System.out.println(number + "! = " + factorial);
    }
}
