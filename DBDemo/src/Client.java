import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {

    public static void main(String[] args) throws SQLException {
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.getConnection();

        Statement statement = connection.createStatement();
        String query = "SELECT COUNT(*) FROM CUSTOMER";
        ResultSet rs = statement.executeQuery(query);
        rs.next();
        System.out.println(rs.getString(1));

        rs.close();
        statement.close();
        connection.close();
    }
}
