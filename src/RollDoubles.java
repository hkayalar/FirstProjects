import java.util.Scanner;

public class RollDoubles {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int dice1 = RollDice();
        int dice2 = RollDice();
        System.out.println("Dice1: "+ dice1 + "\nDice2: "+ dice2+ "\n");
        while(dice1 != dice2){
            dice1 = RollDice();
            dice2 = RollDice();
            System.out.println("Dice1: "+ dice1 + "\nDice2: "+ dice2 + "\n");
        }
    }

    public static int RollDice() {
       double randomNumber = Math.random();
       return ((((int)(randomNumber*10))%6)+1);
    }

}


