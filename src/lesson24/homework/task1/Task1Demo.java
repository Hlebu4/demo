package lesson24.homework.task1;

import java.util.ArrayList;
import java.util.Collection;

public class Task1Demo {
    public static void main(String[] args) {

        Student student1 = new Student("Vasiliy");
        Student student2 = new Student("Kostya");
        Student student3 = new Student("Sergey");
        Student student4 = new Student("Volodiya");
        Student student5 = new Student("Svetlana");

        ArrayList<Student> arrStudent = new ArrayList<>();

        arrStudent.add(student1);
        arrStudent.add(student2);
        arrStudent.add(student3);
        arrStudent.add(student4);
        arrStudent.add(student5);

        System.out.println(arrStudent);

        System.out.println(arrStudent.reversed());

        arrStudent.remove(1);

        System.out.println(" коллекция после удаления второго злемента " + arrStudent);
    }
}
