import java.util.Arrays;

public class LotteryTickets {
    public static void main(String[] args) {
    int[] ticket = {34, 43, 45, 65, 21, 54};
    int[] ticket2 = Arrays.copyOf(ticket, ticket.length);
    ticket2[2]=54;
        System.out.print("Ticket 1 numbers: ");
        printTicket(ticket);

        System.out.print("Ticket 2 numbers: ");
        printTicket(ticket2);
    }
    public static void printTicket(int[] ticket) {
        System.out.println(Arrays.toString(ticket));
    }

}
