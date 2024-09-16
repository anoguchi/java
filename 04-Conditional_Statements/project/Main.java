public class Main {
    public static void main(String[] args) {
        /*
        Project – Task allocation system
        The manager of Mesozoic Eden needs a systematic way of managing the team and ensuring all tasks are efficiently
        accomplished. Design a simple program that assigns tasks to the Mesozoic Eden employees based on their roles
        (for example, feeding, cleaning, security, and tour guiding). The program should decide tasks based on time,
        the employee’s role, and other factors, such as the park’s safety rating. This program would not only help
        streamline operations but also ensure the safety and satisfaction of our staff, visitors, and, most importantly,
        our dinosaurs!
        */

        String role = "Feeding"; // role of the employee
        int time = 14; // current time in 24-hour format
        int safetyRating = 9; // safety rating of the park

        switch (role) {
            case "Feeding":
                if (time >= 7 && time <= 19) {
                    System.out.println("Your task is to feed the dinosaurs.");
                } else {
                    System.out.println("Feeding time is over. Please assist with cleaning tasks.");
                }
                break;
            case "Cleaning":
                System.out.println("Your task is to clean the enclosures.");
                break;
            case "Security":
                if (safetyRating < 8) {
                    System.out.println("Alert! The park's safety rating has fallen. Increase surveillance.");
                } else {
                    System.out.println("Your task is to ensure the park's safety.");
                }
                break;
            case "Tour Guiding":
                if (time >= 10 && time <= 19) {
                    System.out.println("Your task is to guide the park's visitors.");
                } else {
                    System.out.println("Tour guiding hours are over. Please assist with other tasks.");
                }
                break;
            default:
                System.out.println("Unknown job title.");
                break;
        }
    }
}
