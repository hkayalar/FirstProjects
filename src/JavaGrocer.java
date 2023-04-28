import java.util.Scanner;
public class JavaGrocer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Java Grocers.\nWhat can I help you find?");
        String item = scan.nextLine();
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        for (int i = 0; i < aisles.length; i++) {
            if (aisles[i].equals(item)) {
                System.out.println("\nWe have that in aisle: " + i);
                break;
            }
        }
    }
}
