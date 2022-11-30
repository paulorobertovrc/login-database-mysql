import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
    private String loggingUser = "";
    private String loggingPassword = "";
    
    Login() {
        System.out.print("Nome do usuário: ");
        Scanner sc = Main.getScanner();
        this.loggingUser = sc.next();
        System.out.print("Senha: ");
        this.loggingPassword = sc.next();

        if (!(this.loggingUser.isBlank()) && !(this.loggingPassword.isBlank())) {
            int id;
            String username = "";
            String password = "";
            int isAdmin;

            try {
                ResultSet rs = Query.fetchUser(loggingUser);
                rs.next();

                do {
                    id = rs.getInt("id");
                    username = rs.getString("username");
                    password = rs.getString("password");
                    isAdmin = rs.getInt("isAdmin");
                } while (rs.next() && !loggingUser.equals(username));
                
                if (loggingUser.equals(username) && GenerateHash.generateHash(this.loggingPassword).equals(password)) {
                    new InstantiateUser(id, username, isAdmin);
                } else {
                    System.out.println("Acesso negado. Verifique suas credenciais e tente novamente.");
                    Main.finalizar();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
