package patika_1_basic._1_practices;

import java.util.Scanner;

public class UserinputExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı giriniz: ");
        String name = scanner.nextLine();

        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.println("Merhaba " + name + ", " + age + " yaşındasın!");

        scanner.close();

    }
}
