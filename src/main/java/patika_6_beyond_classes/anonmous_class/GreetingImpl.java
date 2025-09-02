package patika_6_beyond_classes.anonmous_class;

public class GreetingImpl implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("GreetingImpl farklı şekilde selamlar!");
    }
}
