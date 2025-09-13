package patika_10_exception_localization._1_exception.custom_exception;

public class InsufficentBalanceRuntimeException extends RuntimeException {

    public InsufficentBalanceRuntimeException(String message) {
        super(message);
    }
}
