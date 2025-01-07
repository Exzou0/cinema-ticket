import java.util.Objects;

public class Viewer {
    private String name;
    private int age;

    public Viewer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Viewer: " + name + ", Age: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Viewer viewer = (Viewer) o;
        return age == viewer.age && Objects.equals(name, viewer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
