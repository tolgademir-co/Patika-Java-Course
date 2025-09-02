package patika_8_lambdas_functional_interfaces._2_functional_interface;

@FunctionalInterface
public interface Greeting {

    void sayHello();

    // void sayHello3(); functional interface içersinde birden fazla abstract method olamaz !!

    default void sayHello2() {
        System.out.println("default method");
    }
}
