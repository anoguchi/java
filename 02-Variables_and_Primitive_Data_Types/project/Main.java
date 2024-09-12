public class Main {
    public static void main(String[] args) {
        String name = "Jaum";
        int age = 55;
        String species = "Triceratops";
        String diet = "herbivore";
        double weight = 8_000; // kg

        String out = "Meet " + name + ", a " + age + " years old " + species + ". As a " + diet +
                ", it has a robust weight of " + weight + " kilograms.";

        System.out.println(out);
    }
}
