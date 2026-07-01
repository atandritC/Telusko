import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {

        // Load the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish a connection to the database
        String url = "jdbc:mysql://localhost:3306/telusko";
        String username = "ac";
        String password = "ac@123";

        Connection connection = DriverManager.getConnection(url, username, password);

        // Create a statement object
        Statement statement = connection.createStatement();

        // Execute a query
        String query = "INSERT INTO student (id, name, age, email) VALUES (1, 'John Doe', 20, 'john.doe@example.com')";
        int rowAffected = statement.executeUpdate(query);

        if (rowAffected > 0) {
            System.out.println("Data inserted successfully.");
        } else {
            System.out.println("Failed to insert data.");
        }

        // Close the resources
        statement.close();
        connection.close();
    }
}
