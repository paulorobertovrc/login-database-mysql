public class AdminUser extends User {
    AdminUser(int id, String login) {
        super(id, login);
        super.setAdmin();
    }

    public void adminMenu() {
        new AdminMenu();
    }
}
