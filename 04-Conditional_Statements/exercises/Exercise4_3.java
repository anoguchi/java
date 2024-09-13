public class Exercise4_3 {
    public static void main(String[] args) {
        /*
         Some dinosaurs are tougher to handle than others. Write an if statement that checks whether a number of years
         of experience is enough experience to work with a certain type of dinosaur. This ensures the safety of both our
         dinosaurs and employees.
        */
        int yearOfExperience = 3;

        if (yearOfExperience == 1) {
            System.out.println("Safety to work with herbivore Dinosaur.");
        } else if (yearOfExperience > 1 && yearOfExperience <= 4) {
            System.out.println("Safety to work with small carnivore Dinosaur.");
        } else if (yearOfExperience >= 5) {
            System.out.println("Safety to work with big carnivore Dinosaur.");
        } else {
            System.out.println("Safety to work delivering coffee.");
        }

    }
}
