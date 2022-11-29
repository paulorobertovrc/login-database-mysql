import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
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
                int id = rs.getInt("id");
                System.out.print (id);
                System.out.print(" ");
                String username = rs.getString("username");
                System.out.println(username);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet fetchUser(String loggingUser) throws SQLException {
            Statement stmt = conn.createStatement();
            stmt.execute("SELECT ID, USERNAME FROM tbLogin");
            ResultSet rs = stmt.getResultSet();
            
            return rs;
    }

    public static int dbSize() throws SQLException {
        int dbSize = 0;

        Statement stmt = conn.createStatement();
        stmt.execute("SELECT COUNT(*) FROM tbLogin");
        ResultSet rs = stmt.getResultSet();
        while (rs.next()) {
            dbSize = rs.getInt("count(*)");
        }        
        
        return dbSize;
    }
}
