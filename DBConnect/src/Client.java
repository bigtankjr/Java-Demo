import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {

    public static void main(String[] args) throws SQLException {
        DbConnect dbConnect = new DbConnect();
        Connection con = dbConnect.getConnection();
        Statement statement = con.createStatement();
        String query= "SELECT * FROM CUSTOMER";
        ResultSet rs = statement.executeQuery(query);

        while(rs.next()){
            System.out.println(rs.getString(2));
        }
        rs.next();
        statement.close();
        rs.close();
        con.close();
    }
}
