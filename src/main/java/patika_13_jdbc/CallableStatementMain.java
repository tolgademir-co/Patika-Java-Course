package patika_13_jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementMain {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/jdbc_example";
        String user = "postgres";
        String password = "0102030123Td";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             CallableStatement callableStatement = connection.prepareCall("CALL add_employee(?,?,?)")
        ) {
            System.out.println("DB Bağlantı Gerçekleşti");

            callableStatement.setInt(1, 7);
            callableStatement.setString(2, "Hakan");
            callableStatement.setInt(3, 2);
            callableStatement.execute();
            System.out.println("Çalışan Kaydedildi!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
