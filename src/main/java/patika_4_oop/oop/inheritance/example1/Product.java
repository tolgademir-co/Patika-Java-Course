package patika_4_oop.oop.inheritance.example1;

public class Product { // extends Object { NOT: HER ZAMAN EKLEMESENİZDE BU ŞEKİLDE KALITIM GERÇEKLEŞİR--

    private String name;

    private double price;

    /*public Product() {
        // default constuructor her zaman olur. fakat yeni bir constuructor oluşturursanız bu default method gider.
    }*/

    public Product(String name) {
        this.name = name;

    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
