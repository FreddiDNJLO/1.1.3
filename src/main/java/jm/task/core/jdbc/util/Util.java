package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/TestBD?user=root&password=root&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "ignatkabatura123";

    public static Connection getMySQLConnection() throws SQLException {
        Connection connection;
        return connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
