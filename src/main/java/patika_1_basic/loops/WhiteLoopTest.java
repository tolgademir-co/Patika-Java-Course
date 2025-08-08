package patika_1_basic.loops;

import java.util.Scanner;
import java.util.SortedMap;

public class WhiteLoopTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "1234";

        while (true) {

            System.out.print("Şifreyi giriniz: ");

            String input = scanner.nextLine();

            if (password.equals(input)) {
                System.out.println("Doğru şifre girdiniz.");
                break;
            }else {
                System.out.println("Yanlış şifre girdiniz.");
            }
        }



    }
}
