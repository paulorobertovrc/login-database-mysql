import java.io.IOException;

public class Menu {
    public final static void clearConsole() throws InterruptedException, IOException {
        new ProcessBuilder("clear").inheritIO().start().waitFor();

    }

    public static void apagarConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}
