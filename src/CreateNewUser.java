import java.util.Scanner;

public class CreateNewUser {
    private String username = "";
    private String password = "";
    private int isAdmin = 0;
    
    
    CreateNewUser() {
        System.out.print("Nome do usuário: ");
        Scanner sc = Main.getScanner();
        username = sc.next();
        System.out.print("Senha: ");
        password = sc.next();
        
        if (!(username.isBlank()) && !(password.isBlank())) {
            System.out.print("Este usuário é Administrador? [S/N] ");
            Character admin = sc.next().toLowerCase().charAt(0);
            while (admin != 's' && admin != 'n') {
                System.out.println("Opção inválida. Informe Sim ou Não.");
                System.out.print("Este usuário é Administrador? [S/N] ");
                admin = sc.next().toLowerCase().charAt(0);
            }
            if (admin == 's') isAdmin = 1;

            String passwordHash = GenerateHash.generateHash(password);

            try {
                String query = " INSERT INTO tbLogin (username, password, isAdmin) VALUES ('" + username + "', '" + passwordHash + "', '" + isAdmin + "');";
                Query.createNewUserQuery(query);
                System.out.println();
                System.out.println("Usuário " + username + " criado com sucesso.");
            } catch (Exception e) {
                e.getMessage();
            }
        } else {
            System.out.println("Os campos não podem estar vazios!");
        }
    }
}
