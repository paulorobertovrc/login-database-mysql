public class AdminUser extends User {
    AdminUser(String login) {
        super(login);
        super.setAdmin();
    }

    public void createUser(String login) {
        System.out.println("teste do método createUser da classe AdminUser");
    }

    public void deleteUser(String login) {
        System.out.println("teste do método deleteUser da classe AdminUser");
    }
}
