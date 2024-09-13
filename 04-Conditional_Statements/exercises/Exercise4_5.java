public class Exercise4_5 {
    public static void main(String[] args) {
        /*
          Proper housing is essential for the dinosaurs’ well-being. Write a switch statement that assigns a dinosaur to
          a specific enclosure based on its size (XS, S, M, L, or XL).
        */
        String size = "M"; // change this variable to test the code

        switch (size) {
            case "XS":
                System.out.println("Assign the dinosaur to the Small Herbivore Enclosure.");
                break;
            case "S":
                System.out.println("Assign the dinosaur to the Medium Herbivore Enclosure.");
                break;
            case "M":
                System.out.println("Assign the dinosaur to the Large Herbivore Enclosure.");
                break;
            case "L":
            case "XL":
                System.out.println("Assign the dinosaur to the Carnivore Enclosure.");
                break;
            default:
                System.out.println("Unknown dinosaur size.");
                break;
        }
    }
}
