import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Hangman! \n");
        int missedCheck = 0;
        System.out.println(gallows[0]);
        String word = words[randomNumber()];
        char[] letters = word.toCharArray();
        char[] placeHolders = new char[letters.length];
        for (int i = 0; i < letters.length; i++) {
            placeHolders[i] = '_';
        }
        System.out.print("Word: ");
        int winCheck=0;
        System.out.print("\n\nMisses: ");
        System.out.println("\n\nGuess: ");
        char guess = scan.next().charAt(0);
        char[] missedLetters = new char[29];
        while(missedCheck<6){
            int existOrNot = checkGuess(guess, letters);
            if (existOrNot != 50) {
                placeHolders = updatePlaceHolders(guess, placeHolders, letters);
                System.out.println(gallows[missedCheck]);
                System.out.println("Word: "+ Arrays.toString(placeHolders));
                System.out.print("Misses: " );
                for(int j=0; j<missedCheck;j++){
                    System.out.print(missedLetters[j]+" ");
                }
                System.out.println("\nGuess: ");
                if(Arrays.toString(placeHolders).equals(Arrays.toString(letters))){
                    System.out.println("Congrats! You found the correct word. You WON!"); break;
                }
                guess = scan.next().charAt(0);
                existOrNot = checkGuess(guess, letters);


            } else if (existOrNot == 50) {
                if (missedCheck!=5) {
                    missedLetters = updateMissedGuesses(guess, missedCheck, missedLetters);
                    System.out.println(gallows[missedCheck + 1]);
                    System.out.println("Word: " + Arrays.toString(placeHolders));
                    System.out.print("Misses: ");
                    for (int j = 0; j < missedCheck + 1; j++) {
                        System.out.print(missedLetters[j] + " ");
                    }
                    System.out.println("\nGuess: ");
                    missedCheck = missedCheck + 1;
                    guess = scan.next().charAt(0);
                    existOrNot = checkGuess(guess, letters);
                } else if (missedCheck==5) {
                    System.out.println(gallows[6]);
                    System.out.println("SORRY! The word was '"+word+"'. You are a loser."); break;
                }
            }
        }
        while (missedCheck==5 && missedCheck==6){
            System.out.println(gallows[6]);
            System.out.println("SORRY! The word was '"+word+"'. You are a loser."); break;
        }

    }
    public static char[] updatePlaceHolders (char guess, char[] placeHolders, char[] letters) {
        for(int i=0; i<placeHolders.length; i++){
            if(letters[i]==guess) {
                placeHolders[i]=guess;
            }
        }
        return placeHolders;
    }
    public static char[] updateMissedGuesses (char guess, int missedCheck, char[] missedLetters) {
        missedLetters[missedCheck]=guess;
        return missedLetters;
        }
    public static int checkGuess(char guess, char[] letters) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == guess) {
                return i;
            }
        }
        return 50;
    }

    public static int randomNumber() {
        double random = (Math.random() * 64);
        return (int) random;
    }
    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
            "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n"};
}
