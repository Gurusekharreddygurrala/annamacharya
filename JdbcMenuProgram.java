import java.sql.*;
import java.util.Scanner;

public class JdbcMenuProgram {

    static final String DB_URL = "jdbc:mysql://localhost:3306/sekhar";
    static final String USER = "root";
    static final String PASS = "22701a0557@G";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Load driver and connect to database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            while (true) {
                System.out.println("\n=== MENU ===");
                System.out.println("1. Insert");
                System.out.println("2. Update");
                System.out.println("3. Delete");
                System.out.println("4. View");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        // Insert
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();

                        String insertSQL = "INSERT INTO students (name, age) VALUES (?, ?)";
                        PreparedStatement insertStmt = conn.prepareStatement(insertSQL);
                        insertStmt.setString(1, name);
                        insertStmt.setInt(2, age);
                        insertStmt.executeUpdate();
                        System.out.println("Record inserted.");
                        break;

                    case 2:
                        // Update
                        System.out.print("Enter student ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new age: ");
                        int newAge = scanner.nextInt();

                        String updateSQL = "UPDATE students SET name = ?, age = ? WHERE id = ?";
                        PreparedStatement updateStmt = conn.prepareStatement(updateSQL);
                        updateStmt.setString(1, newName);
                        updateStmt.setInt(2, newAge);
                        updateStmt.setInt(3, updateId);
                        updateStmt.executeUpdate();
                        System.out.println("Record updated.");
                        break;

                    case 3:
                        // Delete
                        System.out.print("Enter student ID to delete: ");
                        int deleteId = scanner.nextInt();

                        String deleteSQL = "DELETE FROM students WHERE id = ?";
                        PreparedStatement deleteStmt = conn.prepareStatement(deleteSQL);
                        deleteStmt.setInt(1, deleteId);
                        deleteStmt.executeUpdate();
                        System.out.println("Record deleted.");
                        break;

                    case 4:
                        // View
                        String viewSQL = "SELECT * FROM students";
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(viewSQL);

                        System.out.println("\n--- Student Records ---");
                        while (rs.next()) {
                            System.out.println("ID: " + rs.getInt("id") +
                                    ", Name: " + rs.getString("name") +
                                    ", Age: " + rs.getInt("age"));
                        }
                        break;

                    case 5:
                        // Exit
                        System.out.println("Exiting...");
                        conn.close();
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
