package patika_4_oop.oop.polymorphism;

import java.util.Scanner;

public class ShapeAreaCalculation {

    public static void main(String[] args) {
        /* Scanner scanner = new Scanner(System.in);

        System.out.println("Hangi şeklin alanını hesaplamak istersin?");
        System.out.println("1. Daire \n 2. Kare \n 3. Üçgen");

        int choise = scanner.nextInt();

        Shape shape = null;

        switch (choise) {
            case 1:
                System.out.println("Daire'nin yarı çapını girin: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;

            case 2:
                System.out.println("Kare'nin kenar uzunluğunu girin: ");
                double side = scanner.nextDouble();
                shape = new Square(side);
                break;

            case 3:
                System.out.println("Üçgen'nin taban uzunluğunu girin: ");
                double base = scanner.nextDouble();
                System.out.println("Üçgen'nin yüksekliğini girin: ");
                double height = scanner.nextDouble();
                shape = new Triangle(base, height);
                break;

            default:
                System.out.println("Geçersiz bir seçim yapıtınız!");
        }

        double calculatedArea = shape.calculateArea();
        System.out.println("Alan = " + calculatedArea);

         */

        // BU İŞLEM POLYMORPHİSİM--

        Circle circle = new Circle(7);

        Shape shape1 = new Circle(5);
        double calculatedArea = shape1.calculateArea();
        System.out.println("Alan = " + calculatedArea);

        Shape shape2 = new Square(5);
        calculatedArea = shape2.calculateArea();
        System.out.println("Alan = " + calculatedArea);

        Shape shape3 = new Triangle(5,7);
        calculatedArea = shape3.calculateArea();
        System.out.println("Alan = " + calculatedArea);

    }
}
