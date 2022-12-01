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
    
    public static ResultSet listUsersQuery() {
        ResultSet rs;
        
        try {
            Statement stmt = conn.createStatement();
            stmt.execute("SELECT ID, USERNAME, isAdmin FROM tbLogin");
            rs = stmt.getResultSet();
            return rs;            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs = null;
    }

    public static ResultSet fetchUser(String user) throws SQLException {
            Statement stmt = conn.createStatement();
            stmt.execute("SELECT ID, USERNAME, PASSWORD, isAdmin FROM tbLogin");
            ResultSet rs = stmt.getResultSet();
            
            return rs;
    }

    public static ResultSet fetchUser(int id) throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.execute("SELECT ID, USERNAME, PASSWORD, isAdmin FROM tbLogin WHERE id = " + id);
        ResultSet rs = stmt.getResultSet();
        
        return rs;
}

    public static void deleteUser(int id) {
        try {
            Statement stmt = conn.createStatement();
            stmt.execute("DELETE FROM tbLogin WHERE id = " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteUser(String username) {
        try {
            Statement stmt = conn.createStatement();
            stmt.execute("DELETE FROM tbLogin WHERE username = '" + username + "'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
