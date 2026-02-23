import java.util.*;
import java.util.regex.*;

public class AcL {
    private String id;
    private String username;
    private String password;
    private String email;

    public AcL(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void setEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (Pattern.matches(regex, email) && !email.matches(".*\\s+.*")) {
            this.email = email.trim();
        } else {
            System.out.println("Email khong hop le");
        }
    }

    public void setPassword(String password) {
        if (password.replaceAll("\\s+", "") != "" && !password.matches(".*\\s+.*")) {
            this.password = password.trim();
        } else {
            System.out.println("Password khong hop le");
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("userName: " + this.username);
        System.out.println("Password: " + this.password);
        System.out.println("Email" + this.email);
    }

    public static void main(String[] args) {
        AcL a1 = new AcL("201k", "shinchan", "", "");
        a1.setEmail("shin05032006@gmail.com");
        a1.setPassword("ok123");
    }
}
