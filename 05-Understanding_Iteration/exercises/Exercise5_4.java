public class Exercise5_4 {
    public static void main(String[] args) {
        /*
         * For planning purposes, it's essential to know the total weight of all dinosaurs in a specific enclosure.
         * Write a for loop that calculates this.
         */

        int[] weights = {1000, 2000, 3000, 4000, 5000};
        int totalWeight = 0;

        for (int weight : weights) {
            totalWeight += weight;
        }
        System.out.println("Total weight of dinosaurs: " + totalWeight + " kg");
    }
}
