public class InstantiateUser {
    private static int loggedUserId = 0;    
    private static String loggedUserUsername = "";

    public InstantiateUser(int id, String username, int isAdmin) {
        if (isAdmin == 1) {
            AdminUser loggedUser = new AdminUser(id, username);
            loggedUserId = id;
            loggedUserUsername = username;
            loggedUser.adminMenu();
        } else {
            CommonUser loggedUser = new CommonUser(id, username);
            loggedUserId = id;
            loggedUserUsername = username;
            loggedUser.commonMenu();
        }
    }

    public static AdminUser loggedUserisAdminUser(AdminUser adminUser) {
        return adminUser;
    }

    public static CommonUser loggedUserisCommonUser(CommonUser commonUser) {
        return commonUser;
    }

    public static int getLoggedUserId() {
        return loggedUserId;
    }
    
    public static String getLoggedUserUsername() {
        return loggedUserUsername;
    }
}
