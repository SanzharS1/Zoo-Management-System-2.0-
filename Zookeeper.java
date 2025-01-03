import java.util.Objects;

public class Zookeeper {
    private String name;
    private int experienceYears;

    public Zookeeper(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public String getName() {
        return name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public String toString() {
        return name + " (" + experienceYears + " years experience)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zookeeper that = (Zookeeper) o;
        return experienceYears == that.experienceYears && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, experienceYears);
    }

    public boolean equals(Zookeeper other) {
        return this.experienceYears == other.experienceYears;
    }
}

