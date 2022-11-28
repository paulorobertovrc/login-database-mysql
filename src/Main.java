import java.util.Scanner;

public class Main {
    private static boolean continuar = true;
    private static Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Database.connect();
        
        while (continuar) {
            Menu.clear();
            Menu.printMenu();
        }

        System.out.println();
        System.out.println("PROGRAMA ENCERRADO");
        System.out.println();
        scanner.close();
    }

    public static void finalizar() {
        continuar = false;
    }

    public static Scanner getScanner() {
        return scanner;
    }
}
