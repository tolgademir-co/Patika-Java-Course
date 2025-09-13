package patika_10_exception_localization._1_exception;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourceExample {

    public static void main(String[] args) {

        FileInputStream is = null;

        try {
            is = new FileInputStream("text.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
