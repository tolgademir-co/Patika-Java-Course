package patika_6_beyond_classes.record;

import java.util.List;

public class RecordExamples {

    public static void main(String[] args) {

        Point point = new Point(3, 4);
        System.out.println(point);

        Point point1 = new Point(3, 3);
        System.out.println(point1);

        System.out.println("Rectangel Record!");

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Alan: " + rectangle.area());

        System.out.println("Bird Record!");

        Bird momy = new Bird(4, "Serra");
        System.out.println(momy.name() + " - " + momy.numberEggs());

        var child = new Bird(0, "Tolga");
        // child.name = "Lacivert"; compile olmuyor--

        List.of(momy.getClass().getDeclaredMethods()).forEach(System.out::println);
        System.out.println();
        List.of(momy.getClass().getDeclaredConstructors()).forEach(System.out::println);
        System.out.println();

        var child2 = new Bird(0, "Lacivert", "lACO");


    }
}
