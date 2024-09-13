public class Exercise4_2 {
    public static void main(String[] args) {
        /*
        Different species require different care strategies and exhibit unique behavior traits. Write a switch
        statement that prints a description of a dinosaur based on its species. This will help educate both the
        staff and park visitors.
        */
        String dinosaurType = "Velociraptor";
        switch (dinosaurType) {
            case "Albertosaurus":
                System.out.println("Albertosaurus was a tyrannosaur, a family of large theropods from the Late " +
                        "Cretaceous Period. Its massive head measured up to 1 metre (more than 3 feet) long. There " +
                        "were short..");
                break;
            case "Apatosaurus":
                System.out.println("Apatosaurus was a huge sauropod that lived in North America during the Late Jurassic" +
                        " period. It was one of the largest land animals ever to have lived. Its fossils were " +
                        "discovered... ");
                break;
            case "Archaeopteryx":
                System.out.println("Archaeopteryx was a bird-like dinosaur that lived in Europe around 150 million " +
                        "years ago. It had features that resembled those of both birds and dinosaurs, " +
                        "leading many... ");
                break;
            case "Brachiosaurus":
                System.out.println("Brachiosaurus was a huge sauropod that lived in North America during the Late " +
                        "Jurassic Period. Like all sauropods, it had a long, flexible neck, but a relatively short " +
                        "tail. It... ");
                break;
            case "Tyrannosaurus rex":
                System.out.println("Tyrannosaurus rex was a giant theropod that lived in North America in the Late " +
                        "Cretaceous Period, during the very last years of the Age of Dinosaurs. Longer than the width " +
                        "of a... ");
                break;
            case "Velociraptor":
                System.out.println("Velociraptor was a small, bird-like theropod dinosaur belonging to the dromaeosaur " +
                        "group, which also included Deinonychus. It lived about 75 to 71 million years ago, during " +
                        "the... ");
                break;
            default:
                System.out.println("Unknown dinosaur type: " + dinosaurType);
        }

    }
}
