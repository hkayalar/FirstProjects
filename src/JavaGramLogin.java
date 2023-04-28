import java.util.Scanner;

public class JavaGramLogin {
    public static void main(String[] args) {
        String userName = "Samantha";
        String password = "Java<3";
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to javagram! sign in below");
        System.out.println("Username: ");
        String tryUser = scan.nextLine();
        System.out.println("Password: ");
        String tryPassword = scan.nextLine();

        while (!tryUser.equals(userName) || !tryPassword.equals(password)) {
            System.out.println("Try again");
            System.out.println("Username: ");
            tryUser = scan.next();
            System.out.println("Password: ");
            tryPassword = scan.next();
        }
        System.out.println("Sign in successful. Welcome!");
        scan.close();
    }
}
