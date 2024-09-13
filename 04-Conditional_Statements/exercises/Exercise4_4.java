public class Exercise4_4 {
    public static void main(String[] args) {
        /*
         We are working with beautiful but dangerous creatures. So, safety first. Write a program that prints a
         warning message if the park’s safety rating falls below a certain threshold. We must always be alert to
         potential issues that could harm our staff, visitors, or dinosaurs.
        */
        int parkSafety = 8;
        switch (parkSafety) {
            case 1, 2, 3, 4, 5, 6, 7:
                System.out.println("Danger: Park Not Safety");
                break;
            case 8, 9, 10:
                System.out.println("Park Safety");
                break;
            default:
                System.out.println("Unrecognized rating");
                break;
        }
    }
}
