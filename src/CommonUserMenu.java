import java.util.Scanner;

public class CommonUserMenu {
    public CommonUserMenu() {
        Menu.clear();
        System.out.println("===============================================");
        System.out.println("==========   MENU DO USUÁRIO COMUM   ==========");
        System.out.println("===============================================");
        System.out.println("Banco de dados: " + Database.getDbName());
        System.out.println("Usuário: " + User.getLogin());
        System.out.println();
        System.out.println("[ 1 ] Listar usuários");
        System.out.println("[ 2 ] Sair");
        System.out.println();
        System.out.print("Selecione a opção desejada: ");
        Scanner sc = Main.getScanner();
        int menuOp = sc.nextInt();
        switch (menuOp) {
            case 1:
                Menu.clear();
                Query.listUsersQuery();
                Menu.prosseguir();
                new CommonUserMenu();
                break;
            case 2:
                Main.finalizar();
                break;        
            default:
                System.out.println("Opção inválida. Tente novamente.");
                System.out.println();
                Menu.prosseguir();
                Menu.clear();
                Menu.printMenu();
        }
    }
}
