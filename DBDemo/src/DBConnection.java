import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    final static String DBURL = "jdbc:oracle:thin:@LAPTOP-3R3I9QJF:1521:ORCL";
    final static String DBUSER = "c##admin";
    final static String DBPASS = "admin";

    public Connection getConnection() {
        return connection;
    }

    Connection connection;

    public DBConnection() throws SQLException {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        connection = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
    }
}
