package patika_6_beyond_classes.nested_classes;

public class NestedClassMain {

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.outerDisplay();

        Outer.Nested nested = new Outer.Nested();
        nested.nestedDisplay();

        //Outer2.Inner outer2 = new Outer2.Inner(); UYARI: static yapabilirsin.

        /**  burdaki dosyayı kullanabilmek için
         * Outer2.java class gidip içerisindeki
         * private final class Inner { class'ın basın'daki 'private' kaldırmam gerek..

        Outer2 outer2 = new Outer2();
        Outer2.Inner inner = outer2.new Inner();

         */

    }
}
