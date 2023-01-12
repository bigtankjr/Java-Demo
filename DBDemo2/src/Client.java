import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {

    public static void main(String[] args) throws SQLException {
        DBConnect dbConnect = new DBConnect();
        Connection conn = dbConnect.getConnection();

        Statement statement = conn.createStatement();
        String query = "SELECT * FROM CUSTOMER";
        ResultSet rs = statement.executeQuery(query);

        while(rs.next()){
            System.out.println(rs.getString("ADDRESS"));
        }
        rs.next();

        statement.close();
        conn.close();
        rs.close();
    }
}
