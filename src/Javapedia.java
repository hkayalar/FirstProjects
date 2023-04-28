import java.util.Arrays;
import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many historical figures will you register?");
        int figureCount = scan.nextInt();
        scan.nextLine();
        String[][] database = new String[figureCount][3];
        for (int i = 0; i < figureCount; i++) {
            System.out.println("Figure " + (i + 1));
            System.out.print("-Name: ");
            database[i][0] = scan.nextLine();
            System.out.print("-Date of Birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("Occupation: ");
            database[i][2] = scan.nextLine();
        }
        System.out.println("These are the values you stored: ");
        print2DArray(database);
        System.out.println("Who do you want information on? ");
        String figure = scan.nextLine();
        for (int i=0; i<figureCount; i++){
            if(database[i][0].equals(figure)){
                System.out.println("Name: "+database[i][0]+"\nDate of birth:"+database[i][1]+"\nOccupation: "+database[i][2]);

            }
        }
    }
    public static void print2DArray(String[][] database){

        for(int i=0; i<database.length; i++){
            for (int j=0; j<database[i].length; j++){
                System.out.print(database[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}