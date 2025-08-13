package patika_4_oop.oop.inheritance.example1;

public class ProductTest {

    public static void main(String[] args) {

        //Product product = new Product(); // hatalı kullanım.



        Electronic electronic = new Electronic("Kurutma Makinesi");
        //electronic.setName("Kurutma Makinesi");

        Book book = new Book("Simyacı");
        //book.setName("Kimyacı");
        book.setPrice(255);


    }
}
