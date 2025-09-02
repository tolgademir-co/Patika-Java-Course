package patika_8_lambdas_functional_interfaces._1_lambdas;

public class LambdasExample3 {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable çalışıyor...");

            }
        };

        new Thread(runnable).start();

        // Java 8 sonrası
        Runnable runnable1 = () -> System.out.println("Runnable çalışıyor...");
        // runnable1.run(); buda çalışıyor...
        new Thread(runnable1).start();
    }
}
