import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private final static String DBURL = "jdbc:oracle:thin:@192.168.1.3:1521:ORCL";
    private final static String DBUSER = "c##admin";
    private final static String DBPASS = "admin";

    public static Connection getConnection() {
        return connection;
    }

    private static Connection connection;

    public DBConnection() throws SQLException {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        connection = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
    }
}
