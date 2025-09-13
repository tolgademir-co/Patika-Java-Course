package patika_10_exception_localization._1_exception.custom_exception;

public class InsufficentBalanceException extends Exception {

    public InsufficentBalanceException(String message) {
        super(message);
    }
}
