package patika_10_exception_localization._1_exception.custom_exception;

import java.util.ResourceBundle;

public class BankAccount {

    private double balance;

    public BankAccount(double balance, ResourceBundle resourceBundle) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficentBalanceException {

        if (amount > balance) {
            throw new InsufficentBalanceException("Yetersiz bakiye! Çekmek istediğiniz miktar: " + amount);
        }

        balance -= amount;
        System.out.println("Başarıyla " + amount + " TL çekildi! Kalan bakiye: " + balance);
    }

}
