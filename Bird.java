public class Bird extends Animal {
    private double wingSpan;

    public Bird(String name, String species, int age, double wingSpan) {
        super(name, species, age);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    @Override
    public String toString() {
        return super.toString() + ", Wing Span: " + wingSpan + " meters";
    }
}
