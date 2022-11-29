public abstract class User {
    private int id;
    private static String login = "";
    private String password = "";
    private static boolean isAdmin = false;
    
    public User(int id, String login) {
        this.id = id;
        this.login = login;
    }
    
    public int getId() {
        return id;
    }

    public static void setAdmin() {
        User.isAdmin = true;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public static String getLogin() {
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
}
