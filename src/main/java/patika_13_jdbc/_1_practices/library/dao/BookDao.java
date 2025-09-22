package patika_13_jdbc._1_practices.library.dao;

import patika_13_jdbc._1_practices.library.model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BookDao {

    private final Connection connection;

    public BookDao(Connection connection) {
        this.connection = connection;
    }

    public void save(Book book) {

        String sql = """
                INSERT INTO books (title, author_id)
                VALUES (?,?)        
                """;
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setInt(2, book.getAuthor().getId());
            preparedStatement.executeUpdate();
            System.out.println("Book Tablosuna Kayıt Edildin.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveAll(List<Book> books) {
        books.forEach(this::save);
    }

}
