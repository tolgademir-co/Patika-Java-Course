package patika_13_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransacationMain {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/jdbc_example";
        String user = "postgres";
        String password = "0102030123Td";

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB Bağlantı Gerçekleşti!");

            connection.setAutoCommit(false);

            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE accounts SET balance = balance - 100 WHERE id = ?");
            preparedStatement.setInt(1, 1);
            int row = preparedStatement.executeUpdate();

            PreparedStatement preparedStatement1 = connection.prepareStatement("UPDATE accountz SET balance = balance + 100 WHERE id = ?");
            preparedStatement1.setInt(1, 2);
            int row2 = preparedStatement1.executeUpdate();

            //throw new SQLException("Bir hata meydana geldi!");

            connection.commit();

        } catch (SQLException e) {

            try {
                connection.rollback(); // Hata oluşursa işlemleri geri al
                System.out.println(e.getMessage());
                System.out.println("Bir hata meydana geldi: Rollback mekanizması çalıştı");
            } catch (SQLException ex) {
                e.printStackTrace();
            }
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
