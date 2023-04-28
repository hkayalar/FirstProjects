public class GrocerCashier {
    public static void main(String[] args) {
        String[] apples = {"gala", "granny", "macintosh"};
        double[] prices = {1.99, 1.49,1.29};
        System.out.println("Here is your receipt: ");
        for (int i=0; i< apples.length; i++) {
            System.out.println(apples[i] + ": " + prices[i]);
        }
    }
}
