package patika_10_exception_localization._1_exception;

import java.io.IOException;

public class AutoClosableExample {

    public static void main(String[] args) {

        try (MyCustomFileReader myCustomFileReader = new MyCustomFileReader()) {
            System.out.println("try blok");
            throw new IOException("Hata oluştu!");

        } catch (Exception e) {
            System.out.println("Cath blok");

        } finally {
            System.out.println("finally blok!");
        }


    }
}
