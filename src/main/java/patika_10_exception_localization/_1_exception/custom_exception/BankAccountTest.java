package patika_10_exception_localization._1_exception.custom_exception;

import java.util.ResourceBundle;

public class BankAccountTest {

    private static ResourceBundle resourceBundle;

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(100, resourceBundle);

        try {
            bankAccount.withdraw(150);
        } catch (InsufficentBalanceException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        System.out.println("İşlemler devam ediyor..");

    }
}
