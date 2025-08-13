package patika_4_oop.samples;

public class Car extends Object {

    private String brand;

    private String model;

    public static int horsePower = 150;

    //public final static int MAX_HORSE_POWER = 150; // constant -> DEĞİŞTİRİLEMEZ-- FİNAL DEĞİŞKENLER İLK DEĞERE SAHİP OLMALI!

    public static final int MAX_HORSE_POWER = 150;

    public Car() {

    }
    public Car(String brand, String model) { //signature(imza)
        this.brand = brand;
        this.model = model;

    }
    public Car(String brand) {
        this.brand = brand;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
