import java.util.Scanner;

public class CommonUserMenu {
    public CommonUserMenu() {
        Menu.clear();
        System.out.println("===============================================");
        System.out.println("==========   MENU DO USUÁRIO COMUM   ==========");
        System.out.println("===============================================");
        System.out.println("Banco de dados: " + Database.getDbName());
        System.out.println("Usuário: " + InstantiateUser.getLoggedUserUsername() + " | ID: " + InstantiateUser.getLoggedUserId());
        System.out.println();
        System.out.println("[ 1 ] Listar usuários");
        System.out.println("[ 2 ] Sair");
        System.out.println();
        System.out.print("Selecione a opção desejada: ");
        Scanner sc = Main.getScanner();
        int menuOp = -1;
        boolean validInput = false;

        do {
            try {
                menuOp = sc.nextInt();
                validInput = true;
            } catch (Exception e) {
                e.getStackTrace();
            }
        } while (!validInput || menuOp < 1 || menuOp > 2);

        switch (menuOp) {
            case 1:
                Menu.clear();
                new ListUsers();
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
