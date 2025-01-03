public class Main {
    public static void main(String[] args) {
        Mammal lion = new Mammal("Simba", "Lion", 5, false);
        Bird eagle = new Bird("Aquila", "Eagle", 3, 2.5);
        Mammal elephant = new Mammal("Dumbo", "Elephant", 10, true);

        Zookeeper zookeeper1 = new Zookeeper("John", 8);
        Zookeeper zookeeper2 = new Zookeeper("Emma", 8);

        Zoo zoo = new Zoo("Safari Zoo");
        zoo.addAnimal(lion);
        zoo.addAnimal(eagle);
        zoo.addAnimal(elephant);
        zoo.addZookeeper(zookeeper1);
        zoo.addZookeeper(zookeeper2);

        System.out.println(zoo);

        System.out.println("\nAll animals in the zoo:");
        zoo.printAnimals(zoo.getAnimals());

        System.out.println("\nZookeepers in the zoo:");
        zoo.printZookeepers();

        System.out.println("\nAnimals older than 5 years:");
        zoo.printAnimals(zoo.filterAnimalsByAge(5));

        System.out.println("\nSearch for an animal named 'Simba':");
        Animal foundAnimal = zoo.findAnimalByName("Simba");
        if (foundAnimal != null) {
            System.out.println(foundAnimal);
        } else {
            System.out.println("Animal not found.");
        }

        System.out.println("\nAnimals sorted by age:");
        zoo.printAnimals(zoo.sortAnimalsByAge());

        System.out.println("\nComparison using equals():");
        System.out.println("Are lion and elephant equal? " + lion.equals(elephant));
        System.out.println("Do zookeeper1 and zookeeper2 have the same experience? "  + zookeeper1.equals(zookeeper2));
    }
}
