import java.util.Scanner;

public class CommonUserMenu {
    public CommonUserMenu() {
        System.out.println("[ 1 ] Listar usuários");
        System.out.println("[ 2 ] Retornar ao menu anterior");
        System.out.println();
        System.out.print("Selecione a opção desejada: ");
        Scanner sc = Main.getScanner();
        int menuOp = sc.nextInt();
        switch (menuOp) {
            case 1:
                Menu.clear();
                Query.listUsersQuery();
                Menu.prosseguir();
                break;
            case 2:
                Menu.clear();
                Menu.printMenu();
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
