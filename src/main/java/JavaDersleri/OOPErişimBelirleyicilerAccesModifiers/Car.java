package JavaDersleri.OOPErişimBelirleyicilerAccesModifiers;

public class Car {

    private int enginePower, model;
    public int speed;
    protected String color;

    Car() {
        this.model = 2020;
        this.enginePower = 300;
        this.speed = 120;
        this.color = "red";
    }

    private void print() {
        System.out.println(enginePower);
    }

    public void print1() {
        System.out.println(model);
    }

    public void print2() {
        System.out.println(speed);
    }

    public void print3() {
        System.out.println(color);
    }

    public void run() {
        this.print();
    }

    public void run1() {
        print1();
    }
    public void run2() {
        this.print2();
    }
    public void run3() {
        print3();
    }
}
