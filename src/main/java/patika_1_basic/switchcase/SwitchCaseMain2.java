package patika_1_basic.switchcase;

import java.util.Scanner;

public class SwitchCaseMain2 { //Basit işlem yapan Hesap Makinesi

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        double number1 = scanner.nextDouble();
        System.out.println("İkinci sayıyı giriniz: ");
        double number2 = scanner.nextDouble();

        System.out.println("İşlem seçiniz (+,-,*,/): ");
        char operation = scanner.next().charAt(0);

        switch (operation) {

            case '+':
                System.out.println("Sonuç: " + (number1 + number2));
                break;
            case '-':
                System.out.println("Sonuç: " + (number1 + number2));
                break;
            case '*':
                System.out.println("Sonuç: " + (number1 + number2));
                break;
            case '/':
               if (number2 != 0) {
                   System.out.println("Sonuç: " + (number1 + number2));
               } else {
                   System.out.println("İkinci sayı bölme işleminde 0 olamaz!");
               }
               break;
            default:
                System.out.println("Geçersiz İşlem!");

                scanner.close();
        }
    }
}
