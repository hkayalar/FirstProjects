import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi, Choose a number to count to: ");
        int number = scan.nextInt();
        for (int i=1; i<=number; i++) {
            System.out.println(i);
        }
    scan.close();
    }
}
