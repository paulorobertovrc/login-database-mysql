import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDb {
    private String url = "jdbc:mysql://127.0.0.1:3306/vendas";
    private String username = "root";
    private String password = "12345678";
    private Connection conn;
    
    public ConnectToDb() {
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database " + conn.getMetaData().getDatabaseProductName());
            System.out.println(conn.getCatalog());
        } catch (Exception e) {
            throw new IllegalStateException("Cannot connect to the database!", e);
        }

        query();
    }

    public void query() {
        try (Statement stmt = conn.createStatement()) {
            stmt.execute("SELECT CODPROD, DESCRICAO FROM PRODUTO");
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                int id = rs.getInt("CODPROD");
                System.out.print (id);
                System.out.print(" ");
                String desc = rs.getString("DESCRICAO");
                System.out.println(desc);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }            
    }
}
