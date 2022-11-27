public class Main {
    public static void main(String[] args) {
        AdminUser au = new AdminUser("paulo");
        CommonUser cu = new CommonUser("roberto");

        au.listUsers();
        au.createUser("user");
        au.deleteUser("user");
        cu.listUsers();

        ConnectToDb c = new ConnectToDb();
    }
}
