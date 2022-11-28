import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Query {
    private static Connection conn = Database.getConn();
    
    public static void createNewUserQuery(String sqlQuery) {
        try {
            Statement stmt = conn.createStatement();
            stmt.execute(sqlQuery);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void listUsersQuery() {
        try {
            Statement stmt = conn.createStatement();
            stmt.execute("SELECT ID, USERNAME FROM tbLogin");
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                int id = rs.getInt("ID");
                System.out.print (id);
                System.out.print(" ");
                String username = rs.getString("USERNAME");
                System.out.println(username);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
