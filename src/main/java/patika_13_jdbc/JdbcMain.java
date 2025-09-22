package patika_13_jdbc;

import java.sql.*;

public class JdbcMain {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/jdbc_example";
        String user = "postgres";
        String password = "0102030123Td";

        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("DB Bağlantı Gerçekleşti!");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

        while (resultSet.next()) {
            int id = resultSet.getInt("employee_id");
            String name = resultSet.getString("first_name");
            System.out.println(id + "-" + name);

        }
    }
}
