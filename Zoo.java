import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo {
    private String name;
    private List<Animal> animals;
    private List<Zookeeper> zookeepers;

    public Zoo(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
        this.zookeepers = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addZookeeper(Zookeeper zookeeper) {
        zookeepers.add(zookeeper);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Zookeeper> getZookeepers() {
        return zookeepers;
    }

    public List<Animal> filterAnimalsByAge(int age) {
        return animals.stream()
                .filter(animal -> animal.getAge() > age)
                .collect(Collectors.toList());
    }

    public Animal findAnimalByName(String name) {
        return animals.stream()
                .filter(animal -> animal.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public List<Animal> sortAnimalsByAge() {
        return animals.stream()
                .sorted(Comparator.comparingInt(Animal::getAge))
                .collect(Collectors.toList());
    }

    public void printAnimals(List<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void printZookeepers() {
        for (Zookeeper zookeeper : zookeepers) {
            System.out.println(zookeeper);
        }
    }

    @Override
    public String toString() {
        return "Zoo: " + name + "\n" +
                "Number of animals: " + animals.size() + "\n" +
                "Number of zookeepers: " + zookeepers.size();
    }
}

