import java.util.Arrays;

public class CashierAfterTax {
    public static void main(String[] args) {
        String[] apples = {"gala", "granny", "macintosh"};
        double[] prices = {1.99, 2.99,3.99,4.99};
        double[] pricesAfterTax = new double[prices.length];
        System.out.println("Here is your receipt: ");
        for (int i=0; i< apples.length; i++) {
            pricesAfterTax[i] = prices[i]*1.13;

        }
        System.out.println("The original prices are: " + Arrays.toString(prices));
        System.out.println("The after tax prices are: " + Arrays.toString(pricesAfterTax));
    }
}