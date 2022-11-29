public class InstantiateUser {
    InstantiateUser(int id, String username, int isAdmin) {
        if (isAdmin == 1) {
            AdminUser loggUser = new AdminUser(id, username);
            loggUser.adminMenu();
        } else {
            CommonUser loggUser = new CommonUser(id, username);
            loggUser.commonMenu();
        }
    }
}
