package patika_14_final_project.model;

import jdk.jfr.Category;

import java.math.BigDecimal;

public class Product extends BaseModel {

    private String name;
    private BigDecimal price;
    private int stock;
    private Catagory catagory;

    public Product(String name, BigDecimal price, int stock, Catagory catagory) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.catagory = catagory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Catagory getCatagory() {
        return catagory;
    }

    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }
}
