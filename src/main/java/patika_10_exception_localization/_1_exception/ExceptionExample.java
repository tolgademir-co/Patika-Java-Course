package patika_10_exception_localization._1_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        //System.out.println(numbers[5]); // UnCheckedException HATASI ALIRIZ

        //System.out.println(numbers[5]); // UnCheckedException HATASI ALIRIZ

        String name = null;
        //System.out.println(name.toUpperCase());

        try {
            readFile();
            //TODO DOSYA UZERINDE DEĞİŞİKLİK YAP
            //TODO DOSYAYI FARKLI BİR KLASÖRE KAYDET!

            throw new IOException();

        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("Dosya Bulunamadı!");
        }
    }

    private static void readFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("test.txt"));
    }
}