package exercises;

public class Exercise3_4 {
    public static void main(String[] args) {
        float parkMaximumCapacity = 30_000f;
        float currentVisitors = 42_000f;
        boolean maxCapacityReached = currentVisitors >= parkMaximumCapacity;

        System.out.println("Max capacity reached: " + maxCapacityReached);
    }
}
