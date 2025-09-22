package patika_13_jdbc._1_practices.library.dao;

import patika_13_jdbc._1_practices.library.model.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MemberDao {

    private final Connection connection;

    public MemberDao(Connection connection) {
        this.connection = connection;
    }

    public void save(Member member) {

        String sql = """
                INSERT INTO members (name)
                VALUES (?)        
                """;
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, member.getName());
            preparedStatement.executeUpdate();
            System.out.println("Member Tablosuna Kayıt Edildin.");

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public void saveAll(List<Member> members) {
        members.forEach(this::save);

    }
}
