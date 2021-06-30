import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an Username:");
        Username u = new Username();
        String user = sc.next();
        u.setUsername(user);
        System.out.println("Your Username Is: " + u.getUsername());
    }
}
