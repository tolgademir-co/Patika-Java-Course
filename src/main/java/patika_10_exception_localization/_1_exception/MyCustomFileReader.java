package patika_10_exception_localization._1_exception;

public class MyCustomFileReader implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Kapppaattık!!!");

    }
}
