package taskProjekt;

import taskProjekt.entity.Course;
import taskProjekt.entity.Student;
import taskProjekt.service.StudentManager;

import java.util.Map;

public class App {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student vasya = new Student("Vasya", "Ivanov");
        Student petya = new Student("Petya", "Petrov");
        Student sveta = new Student("Sveta", "Svetlova");
        Student gena = new Student("Gena", "Genadiev");
        Student sasha = new Student("Sasha", "Sashun");
        Course course1 = new Course("1");
        Course course2 = new Course("2");
        Course course3 = new Course("3");


        manager.addStudent(vasya);
        manager.addStudent(petya);
        manager.addStudent(sveta);
        manager.addStudent(gena);
        manager.addStudent(sasha);

        for (Map.Entry<Integer, Student> entry : manager.getStudents().entrySet()) {
            System.out.println(entry);
        }

        manager.deleteStudent(petya);
        System.out.println("\n after delete Petya \n");
        for (Map.Entry<Integer, Student> entry : manager.getStudents().entrySet()) {
            System.out.println(entry);
        }

        System.out.println("\n find by id \n");
        manager.searchStudentByNumberStudentCart(4);

        System.out.println(" \n add course for student \n ");

        manager.addCourseForStudent(vasya,course1);
        manager.addCourseForStudent(vasya,course3);
        manager.addCourseForStudent(sveta,course2);
        manager.addCourseForStudent(sveta,course1);
        manager.addCourseForStudent(vasya,course2);
        manager.addCourseForStudent(petya,course1);

        System.out.println("\n after add course \n");
        for (Map.Entry<Integer, Student> entry : manager.getStudents().entrySet()) {
            System.out.println(entry);
        }

        System.out.println("\n student in course 1 \n");
        manager.getStudentInCourse(course1);


    }
}
