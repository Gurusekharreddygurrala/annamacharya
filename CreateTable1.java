import java.sql.*;

public class CreateTable1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sekhar";  // Replace with your DB name
        String user = "root";                               // Replace with your username
        String password = "22701a0557@G";                   // Replace with your password

        String sql = "CREATE TABLE IF NOT EXISTS Students ("
                   + "id INT AUTO_INCREMENT PRIMARY KEY, "
                   + "name VARCHAR(100), "
                   + "email VARCHAR(100), "
                   + "age INT)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully!");

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
