import java.sql.*;

public class JDBC_Connector {

    public static Connection connectDB() {
        Connection conn;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost/bloodbank", "root", "");
            System.out.println("Data Added!");
            return conn;
        } 
        catch (Exception e) {
            System.out.print("Do not connect to DB - Error:" + e);
            return null;
        }
    }
}