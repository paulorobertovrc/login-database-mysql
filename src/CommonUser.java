public class CommonUser extends User {
    CommonUser(int id, String login) {
        super(id, login);
    }

    public void commonMenu() {
        new CommonUserMenu();
    }
}
