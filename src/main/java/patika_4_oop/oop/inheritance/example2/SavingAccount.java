package patika_4_oop.oop.inheritance.example2;

public class SavingAccount extends Account {

    private double interestRate;

    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
    /*
    public SavingAccount(double interestRate) {
        // super(balance);
        this.interestRate = interestRate;
    }
     */

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
