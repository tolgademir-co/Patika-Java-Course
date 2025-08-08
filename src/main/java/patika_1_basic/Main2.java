package patika_1_basic;

import java.sql.SQLOutput;

public class Main2 {

    public static void main(String[] args) {

        int number = 3;

        if (number >= 5) { //false
            //şart gerçekleşirse çalışıcak
            System.out.println("sayı 5'ten büyük ve ya 5'e eşit.");

        } else if (number < 0) {
            System.out.println("sayı 0'dan küçük");

        }

        if (number == 5) {
            System.out.println("sayı 5'ten eşit!");
        } else if (number != 5 && number > 5) {

        }


        int not = 50;
        String harfNotu;

        if (not >= 85) {
            harfNotu = "A";
        } else if (not >= 70) {
            harfNotu = "B";
        } else if (not >= 60) {
            harfNotu = "C";
        } else {
            harfNotu = "D";
        }

        System.out.println(harfNotu);

        {


        }

    }

}
