package patika_13_jdbc;

import java.sql.*;

public class StatementVsPrepareStatement {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/jdbc_example";
        String user = "postgres";
        String password = "0102030123Td";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            System.out.println("DB Bağlantı Gerçekleşti!");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

            String findEmployee = "SELECT * FROM employees WHERE WHERE id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(findEmployee);
            preparedStatement.setInt(1, 2);

            boolean execute = preparedStatement.execute(); // Hem SELECT , ayrıca INSERT, UPDATE, DELETE
            ResultSet rs = preparedStatement.executeQuery(); // Sadece SELECT sorguları için kullanılır
            int i = preparedStatement.executeUpdate(); // INSERT, UPDATE, DELETE için kullanılır. Dönüş tipi INT' dır.

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
