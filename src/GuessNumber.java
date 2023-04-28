import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("I chose a number between 1 and 5. Try to guess it: ");
        int realNumber = 3;
        int guess = scan.nextInt();
        while (guess != realNumber){
            System.out.println("try again.");
            guess = scan.nextInt();
        }
        System.out.println("You got it!");
        scan.close();
    }
}
