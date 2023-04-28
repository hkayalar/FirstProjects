public class HighestRandomScore {

    public static void main(String[] args) {

        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        int highestScore = 0;
        int highestMan = 0;

        for (int i = 0; i < scores.length; i++){

            if(highestScore<scores[i]) {
                highestScore = scores[i];
                highestMan = i;
            }

        }
        System.out.println("The highest score is: " + highestScore + "! Give that man in the seed " + highestMan + " a cookie!!");
    }

    public static int randomNumber(){
        double random = (Math.random() * 50000) + 1;
        return (int) random;
    }
}
