package taskProjekt.entity;

import java.util.HashSet;
import java.util.Objects;

public class Student {
    private final String name;
    private final String surname;
    private final Integer numberStudentCart;
    private final HashSet<String> courses;
    private static int counter = 0;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.numberStudentCart = ++counter;
        this.courses = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getNumberStudentCart() {
        return numberStudentCart;
    }

    public HashSet<String> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numberStudentCart=" + numberStudentCart +
                ", courses=" + courses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname)
                && Objects.equals(numberStudentCart, student.numberStudentCart)
                && Objects.equals(courses, student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, numberStudentCart, courses);
    }
}
