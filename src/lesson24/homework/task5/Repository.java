package lesson24.homework.task5;

import java.util.HashSet;
import java.util.Objects;

public class Repository {

    private HashSet<String> names ;

    public Repository() {
        this.names = new HashSet<>();
    }
    public HashSet<String> getNames() {
        return names;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repository that = (Repository) o;
        return Objects.equals(names, that.names);
    }

    @Override
    public int hashCode() {
        return Objects.hash(names);
    }

    @Override
    public String toString() {
        return "Repository{" +
                "names=" + names +
                '}';
    }
}
