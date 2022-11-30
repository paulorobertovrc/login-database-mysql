import java.util.Scanner;

public class AdminMenu {
    public AdminMenu() {
        Menu.clear();
        System.out.println("===============================================");
        System.out.println("==========   MENU DO ADMINISTRADOR   ==========");
        System.out.println("===============================================");
        System.out.println("Banco de dados: " + Database.getDbName());
        System.out.println("Usuário: " + User.getLogin());
        System.out.println();
        System.out.println("[ 1 ] Criar novo usuário");
        System.out.println("[ 2 ] Apagar usuário");
        System.out.println("[ 3 ] Listar usuários");
        System.out.println("[ 4 ] Sair");
        System.out.println();
        System.out.print("Selecione a opção desejada: ");

        Scanner sc = Main.getScanner();
        int menuOp = sc.nextInt();
        switch (menuOp) {
            case 1:
                Menu.clear();
                new CreateNewUser();
                Menu.prosseguir();
                new AdminMenu();
                break;
            case 2:
                Menu.clear();
                new Delete();
                Menu.prosseguir();
                new AdminMenu();
                break;
            case 3:
                Menu.clear();
                Query.listUsersQuery();
                Menu.prosseguir();
                new AdminMenu();
                break;
            case 4:
                Main.finalizar();
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                System.out.println();
                Menu.prosseguir();
                Menu.clear();
                new AdminMenu();
        }
    }
}
