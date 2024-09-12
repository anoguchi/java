public class Main {
    public static void main(String[] args) {
        /*
        Project – Dino meal planner
        As a zookeeper in Mesozoic Eden, the crucial tasks include planning the meals for our beloved dinosaurs.
        While we’re not using conditionals and loops yet, we can still calculate some basic requirements!
        Develop a simple program to help the zookeepers plan the meal portions for different dinosaurs. The program
        should use the dinosaur’s weight to calculate how much food it needs to eat per meal.
        */

        double dinoWeight = 2000; // in kilograms
        double dailyProportion = 0.05; // 5% of its body weight

        double dailyFood = dinoWeight * dailyProportion;

        int feedingsPerDay = 2;

        double foodPerFeeding = dailyFood / feedingsPerDay;

        System.out.println("Our " + dinoWeight + " kg dinosaur needs to eat " + dailyFood + " kg daily, which means " +
                "we need to server " + foodPerFeeding + " kg per feeding.");


    }
}
