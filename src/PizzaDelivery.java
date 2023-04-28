import java.util.Arrays;
import java.util.Scanner;

public class PizzaDelivery {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many pizza toppings do you want?");
        int numToppings = scan.nextInt(); scan.nextLine();
        String[] topping = new String[numToppings];
        System.out.println("Great, enter each topping!");

        for (int i=0; i<topping.length; i++){
            System.out.println(i+". ");
            topping[i] = scan.nextLine();
        }

        System.out.println("\nThank you! Here are the toppings your ordered");

        for (int i = 0; i < topping.length; i++) {
            System.out.println(i + ". " + topping[i]);
        }

        System.out.println("\nPress anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");

        scan.close();
    }
}
