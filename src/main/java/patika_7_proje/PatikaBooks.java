package patika_7_proje;

import patika_7_proje.model.Author;
import patika_7_proje.model.Product;
import patika_7_proje.model.User;
import patika_7_proje.model.enums.Gender;
import patika_7_proje.service.AuthorService;
import patika_7_proje.service.OrderService;
import patika_7_proje.service.ProductService;
import patika_7_proje.service.UserService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class PatikaBooks {

    public static void main(String[] args) {
        ProductService productService = new ProductService();
        addProduct(productService);

        UserService userService = new UserService();

        OrderService orderService = new OrderService();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1. Müşteri Kaydı");
            System.out.println("2. Sipariş Ver");
            System.out.println("3. Siparişlerim");
            System.out.println("4. Ürünleri Görüntüle");
            System.out.println("5. Çıkış");

            int choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise) {
                case 1:
                    System.out.println("Müşteri İsmini Girin: ");
                    String name = scanner.nextLine();
                    System.out.println("Müşteri email adresini Girin: ");
                    String email = scanner.nextLine();
                    System.out.println("Müşteri Şifresini Giriniz: ");
                    String password = scanner.nextLine();
                    userService.create(name, email, password);
                    break;
                case 2:
                    System.out.println("Müşteri eMail Adresini Giriniz: ");
                    String givenEmail = scanner.nextLine();
                    User foundUser = userService.findUserByEmail(givenEmail);
                    System.out.println("Ürün İsmini Giriniz: ");
                    String productName = scanner.nextLine();
                    Product foundProduct = productService.findProductByName(productName);
                    orderService.create(List.of(foundProduct), foundUser);
                    break;
                case 3:
                    System.out.println("Müşteri Email Adresini Giriniz: ");
                    String giveEmail1 = scanner.nextLine();
                    User foundUser1 = userService.findUserByEmail(giveEmail1);
                    orderService.foundOrders(foundUser1);
                    break;

                case 4:
                    System.out.println("==== Ürün Listesi ====");
                    productService.list();
                    break;
                case 5:
                    System.out.println("Çıkış Yapılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz Bir İşlem Seçtiniz?");
            }
        }

    }

    private static void addProduct(ProductService productService) {
        AuthorService authorService = new AuthorService();
        authorService.create("Patika", "Patika", Gender.WOMEN);
        Author author = authorService.findAuthor("Patika");
        Author paulo = authorService.create("Paulo", "-", Gender.MAN);

        productService.create("Java Programlama", 155, author, LocalDate.of(2022, 01, 01));
        productService.create("Java Programlama-2", 255, author, LocalDate.of(2023, 01, 01));
        productService.create("Java İleri Programlama", 355, author, LocalDate.of(2024, 01, 01));
        productService.create("Aylık Patika.dev Teknoloji Dergisi", 99.9);
        productService.create("Simyacı", 299, paulo, LocalDate.of(2005, 03, 05));
    }
}
