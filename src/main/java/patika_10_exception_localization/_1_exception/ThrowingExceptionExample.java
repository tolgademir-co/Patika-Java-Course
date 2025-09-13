package patika_10_exception_localization._1_exception;

import java.io.FileNotFoundException;

public class ThrowingExceptionExample {

    public static void main(String[] args) {

        try {
            throw new FileNotFoundException("Dosya Bulunamadı!");

        } catch (Exception e) {
            System.out.println(e + "\n");
            System.out.println(e.getMessage() + "\n");
            e.printStackTrace();
        }

        // throw new Exception();
        // throw new Exception("Aman Allahın bir hata oluştu!"); // Does Not Compile

        // throw new RuntimeException(); Does Not Compile. çünkü new keyword'ü yok !!

        // method(); Does Not Compile. çünkü bu method hala hata fırlatıyor
    }

    private static void method() throws FileNotFoundException {
        throw new FileNotFoundException("Dosya Bulunamadı!");
    }
}
