import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void printMenu() {
        System.out.println("========================================");
        System.out.println("==========   MENU PRINCIPAL   ==========");
        System.out.println("========================================");
        System.out.println("Connected to database " + Database.getDbName());
        System.out.println();
        System.out.println("[ 1 ] CRIAR NOVO USUÁRIO");
        System.out.println("[ 2 ] ENTRAR");
        System.out.println("[ 3 ] SAIR");
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
        } while (!validInput || menuOp < 1 || menuOp > 3);

        switch (menuOp) {
            case 1:
                clear();
                new CreateNewUser();
                prosseguir();
                break;
            case 2:
                clear();
                new Login();
                prosseguir();
                break;
            case 3:
                Main.finalizar();
                break;
        
            default:
                System.out.println("Opção inválida. Tente novamente.");
                System.out.println();
                prosseguir();
                clear();
                printMenu();
        }
    }

    public static void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

    public static void prosseguir() {
        try {
            System.out.println();
            System.out.println("Pressione [ENTER] para prosseguir ...");
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
