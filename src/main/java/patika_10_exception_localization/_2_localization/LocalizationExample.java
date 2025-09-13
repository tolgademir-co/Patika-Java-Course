package patika_10_exception_localization._2_localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationExample {

    public static void main(String[] args) {

        Locale trLocale = new Locale("tr", "TR");
        Locale enLocale = Locale.ENGLISH;

        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", enLocale);
        System.out.println(resourceBundle.getString("hello"));

    }
}
