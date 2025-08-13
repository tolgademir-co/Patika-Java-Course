package patika_4_oop.oop.inheritance.example1;

public class Electronic extends Product {

    private int warrantyPerieod;

    public Electronic(String name) {
        super(name);
    }

    public Electronic(String name, double price) {
        super(name, price);
    }

    public int getWarrantyPerieod() {
        return warrantyPerieod;
    }

    public void setWarrantyPerieod(int warrantyPerieod) {
        this.warrantyPerieod = warrantyPerieod;
    }
}
