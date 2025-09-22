package patika_13_jdbc._1_practices.library.dao;

import patika_13_jdbc._1_practices.library.model.Author;
import patika_13_jdbc._1_practices.library.model.Book;
import patika_13_jdbc._1_practices.library.model.Borrow;
import patika_13_jdbc._1_practices.library.model.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BorrowDao {

    private final Connection connection;

    public BorrowDao(Connection connection) {
        this.connection = connection;
    }

    public void save(Borrow borrow) {

        String sql = """
                INSERT INTO borrows (member_id, book_id)
                VALUES (?,?)        
                """;
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, borrow.getMember().getId());
            preparedStatement.setInt(2, borrow.getBook().getId());
            preparedStatement.executeUpdate();
            System.out.println("Borrow Tablosuna Kayıt Edildin.");

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public void saveAll(List<Borrow> borrows) {
        borrows.forEach(this::save);

    }

    public List<Borrow> getBorrowsByMemberId(int memberId) {

        String sql = """
                SELECT
                br.id AS borrow_id, 
                bo.id AS book_id,
                bo.title AS book_title, 
                a.id AS author_id,
                a.name AS author_name,
                m.name AS member_name,
                br.borrow_date
                FROM borrows br
                JOIN books bo ON br.book_id = bo.id
                JOIN authors a ON bo.author_id = a.id
                JOIN members m ON br.member_id = m.id
                WHERE m.id = ?
                """;

        List<Borrow> borrows = new ArrayList<>();

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, memberId);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int borrowId = resultSet.getInt("borrow_id");
                int bookId = resultSet.getInt("book_id");
                String bookTitle = resultSet.getString("book_title");
                int authorId = resultSet.getInt("author_id");
                String authorName = resultSet.getString("author_name");
                String memberName = resultSet.getString("member_name");

                Author author = new Author(authorId, authorName);
                Book book = new Book(bookId, bookTitle, author);
                Member member = new Member(memberId, memberName);
                Borrow borrow = new Borrow(member, book);
                borrow.setId(borrowId);

                borrows.add(borrow);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return borrows;
    }
}
