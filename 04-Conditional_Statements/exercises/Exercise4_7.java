public class Exercise4_7 {
    public static void main(String[] args) {
        /*
        It is important to delegate tasks properly to keep operations running smoothly. Create a program that assigns
        different duties to employees based on their job titles using a switch statement.
        */
        String jobTitle = "Security"; // change this variable to test the code

        switch (jobTitle) {
            case "Feeding":
                System.out.println("Your task is to feed the dinosaurs.");
                break;
            case "Cleaning":
                System.out.println("Your task is to clean the enclosures.");
                break;
            case "Security":
                System.out.println("Your task is to ensure the park's safety.");
                break;
            case "Tour Guiding":
                System.out.println("Your task is to guide the park's visitors.");
                break;
            default:
                System.out.println("Unknown job title.");
                break;
        }
    }
}
