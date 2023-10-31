public class User {
    private String login;
    Account account;

    class Account {
        private String password;
        Account (String password) {
            this.password = password;
        }
        void displayAccount() {
            System.out.printf("Account Login successful!\nLogin: %s\nPassword: %s\n", login, password);
        }
    }

    User (String login, String password) {
        this.login = login;
        account = new Account(password);
    }

}
