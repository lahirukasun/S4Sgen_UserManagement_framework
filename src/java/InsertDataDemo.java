import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
public class InsertDataDemo {
    public static void main(String[] args) {
        Connection connection = null;
        Statement stmt = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/s4sgen", "root", "thela");
             
            stmt = connection.createStatement();
            stmt.execute("INSERT INTO user (first_name,last_name) "
                                + "VALUES ('saliya','hasantha')");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}