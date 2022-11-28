import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static String url = "jdbc:mysql://127.0.0.1:3306/";
    private static String dbName = "ctd";
    private static String username = "root";
    private static String password = "12345678";
    private static Connection conn;
    
    public static String getDbName() {
        return dbName;
    }

    public static void connect() {
        try {
            conn = DriverManager.getConnection(url + dbName, username, password);
            createTable();
        } catch (Exception e) {
            throw new IllegalStateException("Cannot connect to the database!", e);
        }
    }

    private static void createTable() {
        try {
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS `" + dbName + "`.`tbLogin` (" + 
                "`id` INT UNSIGNED NOT NULL AUTO_INCREMENT," + 
                "`username` VARCHAR(50) NOT NULL," +
                "`password` VARCHAR(50) NULL DEFAULT NULL," + 
                "`isAdmin` BIT(1) NOT NULL DEFAULT 0," +
                "PRIMARY KEY (`id`));");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn() {
        return conn;
    }
}
