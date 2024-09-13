public class Exercise4_6 {
    public static void main(String[] args) {
        /*
          Proper nutrition is crucial for maintaining our dinosaurs’ health. Write an if statement that determines the
          number of feeds a dinosaur requires per day based on its weight.
        */
        double weight = 8000; // dinosaur weight in kilograms

        if (weight < 500) {
            System.out.println("Feed the dinosaur once a day.");
        } else if (weight < 2000) {
            System.out.println("Feed the dinosaur twice a day.");
        } else {
            System.out.println("Feed the dinosaur three times a day.");
        }
    }
}
