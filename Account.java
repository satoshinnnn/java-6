public class Account {
    private String username;
    private String password;
    private String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("Username: " + this.username);
        System.out.println("Password: ******");
        System.out.println("Email: " + this.email);
    }

    public void changePassword(String newPassword){
        this.password = newPassword;
    }

    public static void main(String[] args) {
        Account ac1 = new Account("shinchan", "1001", "shin05032006@gmail.com");
        Account ac2 = new Account("shinchan2", "1001", "shin05032006@gmail.com");

        ac2.changePassword("2006");
        ac2.displayInfo();
    }
}
