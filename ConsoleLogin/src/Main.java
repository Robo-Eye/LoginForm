import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        Username u = new Username();
        String user;
        do{
            System.out.println("Please enter an Username:");
            user = sc.next();
        }while(!(u.regexChecker(user)));

        u.setUsername(user);
        System.out.println("Your Username Is: " + u.getUsername());


        Password p = new Password();
        String pass;
        do{
            System.out.println("Please enter a password: ");
            pass = sc.next();
        }while(!(p.regexChecker(pass)));
        p.setPassword(pass);
    }
}
