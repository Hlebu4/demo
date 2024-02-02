package lesson24.task2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {

    private String name ;
    private Integer idPerson ;

    public Person(String name, Integer idPerson) {
        this.name = name;
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", idPerson=" + idPerson +
                '}';
    }
}
