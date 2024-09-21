public class Main {
    public static void main(String[] args) {
        /*
         * Project - Dino meal planner
         * Dinosaurs are not easy animals to keep. This is very advanced pet ownership. The right nutrition is difficult
         * to manage, but it's vital to their health and well-being. Therefore, you are asked to create a system that
         * can manage the feeding schedule of our various dinosaur residents.
         *
         * The project's primary goal is to create a program that calculates the meal portions and feeding times for
         * each dinosaur. Since we haven't covered arrays yet, we'll focus on a single dinosaur for now.
         *
         * Here's how we can do it:
         *
         * 1. Start by declaring a variable to hold the current time: let's say it's an integer, and it goes from 0
         * (midnight) to 23 (last hour of the day).
         *
         * 2. Define variables for each dinosaur species with different feeding times. For example, T-Rex could eat at
         * 8 (morning), 14 (afternoon), and 20 (evening), while the Brachiosaurus could eat at 7 (morning), 11 (mid-
         * morning), 15 (afternoon), and 19 (evening).
         *
         * 3.Next, establish a conditional statement (such as an if-else block) to check whether it's feeding time for
         * each species, comparing the current time with their feeding times.
         *
         * 4. Now, let's define the feeding portions for our dinosaurs. We can assume that each species requires a
         * different amount of food, depending on their sizes. For instance, the T-Rex requires 100kg of food per meal,
         * while the Brachiosaurus requires 250kg of food per meal.
         *
         * 5. Similarly, using an if-else block, check which species you are dealing with and assign the food portions
         * accordingly.
         *
         * 6. Finally, print the result. For instance, "It's 8:00 - Feeding time for T-Rex with 100kg of food".
         *
         * 7. Wrap all the preceding information inside a loop that runs from 0 to 23, simulating the 24 hours in a
         * day.
         */

        int tRexMeal = 100;
        int brachioMeal = 250;

        for (int time = 0; time < 24; time++) {
            if (time == 8 || time == 14 || time == 20) {
                System.out.println("It's " + time + ":00 - Feeding time for T-Rex with " + tRexMeal + "kg of food");
            }
            if (time == 7 || time == 11 || time == 15 || time == 19) {
                System.out.println("It's " + time + ":00 - Feeding time for Brachiosaurus with " + brachioMeal +
                        "kg of food");
            }
        }
    }
}
