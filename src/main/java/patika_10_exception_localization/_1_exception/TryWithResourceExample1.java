package patika_10_exception_localization._1_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceExample1 {

    public static void main(String[] args) {

        String filePath = "text.txt";

        try (var in = new FileInputStream(filePath); // ; ile ayırma gerçekleştirmemiz gerekiyor
             var out = new FileOutputStream("output.txt")) { // TryWithResource
            // Dosya üzerinde işlemler yapıldı.
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* HATALI BİR İŞLEM

        var in = new FileInputStream(filePath);
        try (in) {
            // Dosya üzerinde işlemler yapıldı.
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         */


    }
}
