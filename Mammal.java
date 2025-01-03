public class Mammal extends Animal {
    private boolean isHerbivore;

    public Mammal(String name, String species, int age, boolean isHerbivore) {
        super(name, species, age);
        this.isHerbivore = isHerbivore;
    }

    public boolean isHerbivore() {
        return isHerbivore;
    }

    @Override
    public String toString() {
        return super.toString() + ", Herbivore: " + isHerbivore;
    }
}
