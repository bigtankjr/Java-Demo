import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {
    public static void main(String[] args)throws SQLException {
        DBConnection dbConnection = new DBConnection();

        Connection connection = dbConnection.getConnection();
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM CUSTOMER";
        ResultSet rs = statement.executeQuery(query);

        while(rs.next()){
            System.out.println(rs.getString("ADDRESS") +" : "+ rs.getString("CITY") + " : "+ rs.getString("STATE"));
        }

        rs.next();
        statement.close();
        connection.close();
    }
}
