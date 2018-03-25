import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/MyDatabase", "root","" );
        System.out.println("Connection!");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from A");
        while (resultSet.next()){
            System.out.println("____________________________________________");
            System.out.println("Id: " + resultSet.getInt(1));
            System.out.println("Name: " + resultSet.getString(2));
            System.out.println("eMail: " + resultSet.getString(3));
            System.out.println("____________________________________________");
        }
        connection.close();
        System.out.println("Connection closed!");
    }
}
