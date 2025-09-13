package patika_10_exception_localization._1_exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class TryCatchExample {

    public static void main(String[] args) {

        String[] numbers = {"patika", "2"};

        try {

            System.out.println(Integer.parseInt(numbers[1])); // NumberFormatException
            // protected code & Hata oluşabilicek kodlar
            method();

        } catch (ArrayIndexOutOfBoundsException | FileNotFoundException |
                 NumberFormatException e) { // Bir catch bloğuna birden fazla isimlendirme yapabilirsin.
            System.out.println("Parse edilirken bir hata oluştu!");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());

        } catch (IOException e) {
            // Exception handler & Hata yakalanınca çalışıcak kodlar
            System.out.println(e.getMessage());
        } finally {
            // Her zaman çalışır.
            // finally bloğu sıralama olarak en son olmalıdır.
            System.out.println("Her zaman çalışır!");
        }

        try {

        } finally {
            System.out.println("Her zaman çalışır!");
        }

        try {
            System.out.println(5 / 0);

        } catch (ArithmeticException e) {
            System.out.println("Bir hata oluştu!" + e.getMessage());

        } catch (Exception e) {
            System.out.println("Runtime exception!" + e.getMessage());

        }
    }

    private static void method() throws IOException {
        throw new IOException("Bir Hata Oluştu!");
    }
}
