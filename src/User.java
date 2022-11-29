public abstract class User {
    private int id;
    private String login = "";
    private String password = "";
    private static boolean isAdmin = false;

    public User(int id, String login) {
        this.id = id;
        this.login = login;
    }
    
    public static void setAdmin() {
        User.isAdmin = true;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    User(String login) {
        this.login = login;
    }

    public void listUsers() {
    }
}
