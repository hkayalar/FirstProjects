import java.util.Scanner;

public class RollingGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rolling Java. Type anything to start.");
        String anything = scan.nextLine();
        System.out.println("Great, here are the rules: \nIf you roll a 6 the game stops. \nIf you roll a 4 nothing happens. \nOtherwise, you get 1 point.\nYou must collect at least 3 points to win. Enter anything to roll:");
        int totalPoint = 0;
        int diceRoll = RollDice();
        while (diceRoll != 6 || totalPoint < 3) {
            scan.nextLine();
            diceRoll = RollDice();
            System.out.println("You rolled a " + diceRoll + ".");

            if (diceRoll == 1 || diceRoll == 2 || diceRoll == 3 || diceRoll == 5) {
                totalPoint++;
            }

            if (totalPoint == 3) {
                System.out.println("congrats. you win!");
                break;
            }

            if (diceRoll == 6) {
                    System.out.println("Sorry! you failed!");
                    break;
                }
            }
        }
        public static int RollDice() {

        double randomNumber = Math.random();
        return ((((int) (randomNumber * 10)) % 6) + 1);

    }
}