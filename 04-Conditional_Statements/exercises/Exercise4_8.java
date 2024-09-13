public class Exercise4_8 {
    public static void main(String[] args) {
        /*
        The park is not open to day visitors 24/7. Write an if statement that checks whether the park is open for them
        based on the time. They are open for day visitors from 10 A.M. to 7 P.M. This helps in managing visitor
        expectations and staff schedules.
        */
        int time = 9; // current time in 24-hour format

        if (time >= 10 && time <= 19) {
            System.out.println("The park is open for day visitors.");
        } else {
            System.out.println("The park is closed for day visitors.");
        }
    }
}
