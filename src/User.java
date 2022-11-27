public abstract class User {
    private String login = "";
    private String password = "";

    User(String login) {
        this.login = login;
    }

    public void listUsers() {
        System.out.println("teste do método listUsers da classe User");
    }
}
