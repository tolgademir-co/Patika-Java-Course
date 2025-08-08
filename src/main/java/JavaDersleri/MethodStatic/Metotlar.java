package JavaDersleri;

public class Metotlar {

    public static void main(String[] args) {

        System.out.println(islem(3,7));
        System.out.println(islem2(4.673,11.9637));
        System.out.println(islem3("JAVA", "SE"));

    }

    public static int islem(int a, int b) {

        return (a + b);
    }

    public static double islem2(double x, double y) {

        return (x + y);
    }

    public static String islem3(String name, String surname) {

        return (name + surname);
    }
}
