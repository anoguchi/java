public class Exercise5_3 {
    public static void main(String[] args) {
        /*
         * We all love the thrill of waiting for the park to open. Use a while loop to print out a countdown to the
         * park's opening time.
         */

        int countdown = 60;
        while (countdown >= 0) {
            System.out.println("Park opens in " + countdown + " minutes.");
            countdown--;
        }
        System.out.println("Park is now open!");
    }
}
