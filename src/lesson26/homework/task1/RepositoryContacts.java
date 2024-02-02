package lesson26.homework.task1;

import java.util.HashMap;
import java.util.Objects;

public class RepositoryContacts {

    private final HashMap <String , String> contacts;

    public RepositoryContacts() {
        this.contacts = new HashMap<>();
    }

    public HashMap<String, String> getContacts() {
        return contacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RepositoryContacts that = (RepositoryContacts) o;
        return Objects.equals(contacts, that.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contacts);
    }

    @Override
    public String toString() {
        return "RepositoryContacts{" +
                "contacts=" + contacts +
                '}';
    }
}
