package patika_13_jdbc._1_practices;

import java.sql.*;

public class JdbcCrudExample {

    private static final String URL = "jdbc:postgresql://localhost:5432/jdbc_example";
    private static final String USER = "postgres";
    private static final String PASSWORD = "0102030123Td";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Veritabanına Bağlanıldı!");

            readEmployees(connection);

            updateEmployee(connection, "Cem", 2);

            deleteEmployee(connection, 5);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteEmployee(Connection connection, int id) {

        String sql = """
                DELETE FROM employees
                WHERE employee_id = ?
                """;

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);
            int row = preparedStatement.executeUpdate();
            System.out.println(row + " çalışan silindi!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateEmployee(Connection connection, String newName, int id) {

        String sql = """
                UPDATE employees SET first_name = ?
                WHERE employee_id = ?
                """;

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, id);
            int rows = preparedStatement.executeUpdate();
            System.out.println(rows + " çalışan güncellendi!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void readEmployees(Connection connection) {

        String sql = """
                SELECT e.employee_id, e.first_name, d.department_name FROM employees e
                LEFT JOIN departments d
                ON e.deparment_id = d.department_id
                """;

        try (Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("--- Çalışan Listesi ----");
            while (resultSet.next()) {
                System.out.printf("ID: %d, İsim: %s, Departman: %s %n",
                        resultSet.getInt("employee_id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("department_name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
