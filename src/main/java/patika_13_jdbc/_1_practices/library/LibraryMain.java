package patika_13_jdbc._1_practices.library;

import patika_13_jdbc._1_practices.library.dao.AuthorDao;
import patika_13_jdbc._1_practices.library.dao.BookDao;
import patika_13_jdbc._1_practices.library.dao.BorrowDao;
import patika_13_jdbc._1_practices.library.dao.MemberDao;
import patika_13_jdbc._1_practices.library.model.Author;
import patika_13_jdbc._1_practices.library.model.Book;
import patika_13_jdbc._1_practices.library.model.Borrow;
import patika_13_jdbc._1_practices.library.model.Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class LibraryMain {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/library";
        String user = "postgres";
        String password = "0102030123Td";


        try (Connection connection = DriverManager.getConnection(url, user, password)) {

            System.out.println("DB bağlantı gerçekleştirildi.");

            Member member = new Member(1, "Cem");
            Member member1 = new Member(3, "Elif");
            Member member2 = new Member(4, "Emir");

            MemberDao memberDao = new MemberDao(connection);
            //memberDao.save(member);
            //memberDao.saveAll(List.of(member1, member2));

            Author author = new Author(1, "Ahmet Ümit");

            AuthorDao authorDao = new AuthorDao(connection);
            //authorDao.save(author);

            // Book Save--
            Book book = new Book(1, "Yırtıcı Kuşlar Zamanı", author);
            Book book1 = new Book(2, "Kayıp Tanrılar Ülkesi", author);
            Book book2 = new Book(3, "Beyoğlu'nun En Güzel Abisi", author);
            Book book3 = new Book(4, "Başkomser Nevzat", author);

            BookDao bookDao = new BookDao(connection);
            //bookDao.saveAll(List.of(book, book1, book2, book3));


            BorrowDao borrowDao = new BorrowDao(connection);
            /*  borrowDao.saveAll(List.of(new Borrow(member, book),
                    new Borrow(member, book1),
                    new Borrow(member, book2),
                    new Borrow(member1, book1),
                    new Borrow(member2, book3)));   */

            List<Borrow> borrows = borrowDao.getBorrowsByMemberId(member.getId());

            for (Borrow borrow : borrows) {

                System.out.printf("- %s (%s), Ödünç Alınma Tarihi: %s %n"
                        , borrow.getBook().getTitle()
                        , borrow.getBook().getAuthor().getName()
                        , borrow.getBorrowDate());
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
