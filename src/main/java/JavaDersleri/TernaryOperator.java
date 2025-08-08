package JavaDersleri;

public class TernaryOperator {
    public static void main(String[] args) {

        String message = "";

        int num = 28;

        /* Bu kod çalışır ama fazla gereksiz kod yazımı var..
        if (num > 10) {
            message = "Sayı 10'dan Büyük!";
        }
        else {
            message = "Sayo 10'dan Küçük!";
        }
         */

        message = num < 10 ? "Sayı 10'dan Büyük!" : "Sayo 10'dan Küçük!"; // Bu komut yukarının verdiği değerleri veriyor daha basit ve okunur..

        System.out.println(message);

        }
    }
