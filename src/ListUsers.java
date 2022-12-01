import java.util.Arrays;
import java.util.stream.Collectors;

public class ListUsers {
    public ListUsers() {
        System.out.println("=============================================");
        System.out.println("============   LISTAR USUÁRIOS   ============");
        System.out.println("=============================================");
        System.out.println();

        // Query.listUsersQuery();
    }

    private String drawTable(String[][] table) {
        String borderRow = Arrays.stream(table[0])
                .map(str -> "-".repeat(str.length()))
                .collect(Collectors.joining("+", "+", "+\n"));
        
        return Arrays.stream(table)
                .map(row -> Arrays.stream(row)
                .collect(Collectors.joining("|", "|", "|\n")))
                .collect(Collectors.joining(borderRow, borderRow, borderRow));
    }
}
