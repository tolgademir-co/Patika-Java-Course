package patika_6_beyond_classes.nested_classes;

public class Outer2 {

    private static String massage = "message";

    private final class Inner {

        private static String massage = "message";

        void innerDisplay() {
            System.out.println("Inner class");
        }
    }

    public void outer2Display() {
        Outer2 outer = new Outer2();
        Outer2.Inner inner = outer.new Inner();

        inner.innerDisplay();

        System.out.println("Outer2 class");
    }
}
