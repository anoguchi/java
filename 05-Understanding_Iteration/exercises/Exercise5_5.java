public class Exercise5_5 {
    public static void main(String[] args) {
        /*
         * Ticket selling can get hectic during the peak season. Write a while loop that simulates the park's ticket
         * selling process until tickets are sold out.
         */

        int tickets = 100;
        while (tickets >= 0) {
            System.out.println("Tickets remaining: " + tickets);
            tickets--;
        }
        System.out.println("Tickets are sold out!");
    }
}
