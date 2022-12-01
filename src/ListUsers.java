import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ListUsers {
    public ListUsers() {
        System.out.println("=============================================");
        System.out.println("============   LISTAR USUÁRIOS   ============");
        System.out.println("=============================================");
        System.out.println();

        List<User> userList = new ArrayList<>();
        
        try {
            int id = 0;
            String username = "";
            int isAdmin = 0;
            
            ResultSet rs = Query.listUsersQuery();
            rs.next();           

            do {
                id = rs.getInt("id");
                username = rs.getString("username");
                isAdmin = rs.getInt("isAdmin");
                User usr = null;
                if (isAdmin == 0) {
                    usr = new CommonUser(id, username);
                    userList.add(usr);
                } else {
                    usr = new AdminUser(id, username);
                    userList.add(usr);
                }
            } while (rs.next());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("+--- ID ---+---------- USERNAME ------------+");
        for (User user : userList) {
            System.out.println("|    " + user.getId() + "     | " + user.getLogin());
        }      
    }
}
