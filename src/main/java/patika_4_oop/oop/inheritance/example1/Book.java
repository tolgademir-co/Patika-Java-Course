package patika_4_oop.oop.inheritance.example1;

public class Book extends Product {

    private String author;

    /*
    public Book() {
    // super class'ında yani Product içerisinde boş bir constructor olmadığı için buraya da ekleyemezsin--
    }
    */

    public Book(String name) {
        super(name);

    }

    public Book(String name, double price) {
        super(name, price);

    }


}
