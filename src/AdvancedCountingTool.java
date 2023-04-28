import java.util.Scanner;

public class AdvancedCountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi, Choose a number to count by: ");
        int countBy = scan.nextInt();

        System.out.println("Hi, Choose a number to count from: ");
        int countFrom = scan.nextInt();

        System.out.println("Hi, Choose a number to count to: ");
        int countTo = scan.nextInt();

        for (int i=countFrom; i<=countTo; i=i+countBy) {
            System.out.print(i+" ");
        }
        scan.close();
    }
}
