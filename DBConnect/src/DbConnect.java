import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {

    private static String DBURL = "jdbc:oracle:thin:@192.168.1.3:1521:ORCL";
    private static String DBUSER = "c##admin";
    private static String DBPASS = "admin";
    private Connection connection;

    public DbConnect() throws SQLException {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        connection = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
    }

    public Connection getConnection(){

        return connection;
    }
}
