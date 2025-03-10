package MyProject.learningmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String url = "jdbc:mysql://localhost:3307/kayongosdb";
        String user = "root";
        String password = "Developer256@%";
        String query = " CREATE TABLE Operations_Team( "
        		+ " Worker_id INT NOT NULL AUTO_INCREMENT, "
        		+ " Name VARCHAR(255) NOT NULL, "
        		+ " ROLE VARCHAR(255) NOT NULL, "
        		+ " DEPARTMENT VARCHAR(255) NOT NULL, "
        		+ " SALARY INT NOT NULL,"
        		+ " PRIMARY KEY (Worker_id)) ";
        try {
        	Connection connection = DriverManager.getConnection(url, user, password);
        	System.out.println("Connected to the database.");
        	PreparedStatement preparedStatement = connection.prepareStatement(query);
        	preparedStatement.executeUpdate();
        	System.out.println("Table created successfully.");
        }catch(SQLException error) {
        	System.out.println("Something went wrong." + error);
        }
    }
}
