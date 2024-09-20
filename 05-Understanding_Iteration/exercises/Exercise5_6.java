public class Exercise5_6 {
    public static void main(String[] args) {
        /*
         * Security is our topmost priority. Use a do-while loop to simulate a security check process that continues
         * until all security measures are met.
         */

        int safetyRating = 4;
        boolean securityMeasuresMet = false;
        do {
            System.out.println("Measuring security...");
            if (safetyRating >= 8) {
                securityMeasuresMet = true;
                System.out.println("Security measures met.");
            } else {
                System.out.println("Security measures not met.");
                break;
            }
        } while (!securityMeasuresMet);
    }
}
