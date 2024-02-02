package taskProjekt.entity;

import java.util.HashSet;

public class Course {

    private final String titleCourse;
    private final HashSet<Student> students;

    public Course(String titleCourse) {
        this.titleCourse = titleCourse;
        this.students = new HashSet<>();
    }

    public String getTitleCourse() {
        return titleCourse;
    }

    public HashSet<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "titleCourse='" + titleCourse + '\'' +
                ", students=" + students +
                '}';
    }

}
