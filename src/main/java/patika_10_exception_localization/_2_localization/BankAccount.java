package patika_10_exception_localization._2_localization;

import patika_10_exception_localization._1_exception.custom_exception.InsufficentBalanceException;
import patika_10_exception_localization._2_localization.exceptions.ExceptionMassages;

import java.util.ResourceBundle;

public class BankAccount {

    private double balance;

    private ResourceBundle resourceBundle;

    public BankAccount(double balance, ResourceBundle resourceBundle) {
        this.balance = balance;
        this.resourceBundle = resourceBundle;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficentBalanceException {

        if (amount > balance) {
            throw new InsufficentBalanceException(resourceBundle.getString(ExceptionMassages.INVALID_BALANCE));
        }

        balance -= amount;
        System.out.println("Başarıyla " + amount + " TL çekildi! Kalan bakiye: " + balance);
    }

}
