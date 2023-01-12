import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private final static String DBURL = "jdbc:oracle:thin:@192.168.1.3:1521:ORCL";
    private final static String DBUSER = "c##admin";
    private final static String DBPASS = "admin";

    public Connection getConnection() {
        return connection;
    }

    private Connection connection;
    public DBConnect() throws SQLException {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        connection = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
    }
}
