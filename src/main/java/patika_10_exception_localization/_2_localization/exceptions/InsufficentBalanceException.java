package patika_10_exception_localization._2_localization.exceptions;

public class InsufficentBalanceException extends RuntimeException {

    public InsufficentBalanceException(String message) {
        super(message);
    }
}
