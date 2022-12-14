import java.util.Scanner;

public class Delete {
    public Delete() {
        System.out.println("==============================================");
        System.out.println("=============   APAGAR USUÁRIO   =============");
        System.out.println("==============================================");
        System.out.println("Usuário: " + InstantiateUser.getLoggedUserUsername() + " | ID: " + InstantiateUser.getLoggedUserId());
        System.out.println();
        
        System.out.println("[ 1 ] Apagar por ID | [ 2 ] Apagar por nome de usuário");
        System.out.print("> ");
        Scanner sc = Main.getScanner();
        int opt = sc.nextInt();
        System.out.println();

        while (opt < 1 || opt > 2) {
            System.out.println("Opção inválida. Tente novamente.");
            System.out.println();
            System.out.println("[ 1 ] Apagar por ID | [ 2 ] Apagar por nome de usuário");
            System.out.print("> ");
            sc = Main.getScanner();
            opt = sc.nextInt();
        }

        if (opt == 1) {
            System.out.print("Informe o ID do usuário: ");
            int id = sc.nextInt();
            Query.deleteUser(id);
        } else {
            System.out.print("Informe o nome de usuário: ");
            String username = sc.next();
            Query.deleteUser(username);
        }
    }
}
