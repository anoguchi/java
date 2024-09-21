public class Exercise5_2 {
    public static void main(String[] args) {
        /*
         * Some of our dinosaurs have large appetites! Write a do-while loop that continues to feed a dinosaur until it
         * is no longer hungry.
         */
        boolean hungry = true;
        
        do {
            System.out.println("Feeding dinosaur...");
            System.out.println("Feeding dinosaur...");
            System.out.println("Feeding dinosaur...");
            hungry = false;
        } while (hungry);
    }
}
