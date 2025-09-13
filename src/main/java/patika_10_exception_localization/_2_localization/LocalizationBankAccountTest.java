package patika_10_exception_localization._2_localization;

import patika_10_exception_localization._1_exception.custom_exception.InsufficentBalanceException;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationBankAccountTest {

    public static void main(String[] args) {

        Locale trLocale = new Locale("tr", "TR");
        Locale enLocale = Locale.ENGLISH;

        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", enLocale);

        BankAccount bankAccount = new BankAccount(100, resourceBundle);
        try {
            bankAccount.withdraw(150);
        } catch (InsufficentBalanceException e) {
            System.out.println(e.getMessage());        }
    }
}
