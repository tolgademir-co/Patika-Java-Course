package patika_10_exception_localization._1_exception.custom_exception;

public class CustomExceptionExample {

    public static void main(String[] args) {


        try {
            //throw new MyCustomException("Runtime exception hata mesajım");
            throw new MyCustomException2("Exception için hata mesajı");
        } catch (MyCustomException2 e) {
            throw new RuntimeException(e);
        }


    }
}
