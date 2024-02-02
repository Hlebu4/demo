package taskProjekt.service;

import taskProjekt.entity.Course;
import taskProjekt.entity.Student;

import java.util.HashMap;

public class StudentManager implements StudentManagerInterface{

    private HashMap <Integer, Student> students;

    public StudentManager() {
        this.students = new HashMap<Integer , Student>();
    }

    public HashMap<Integer, Student> getStudents() {
        return students;
    }

    public void setStudents(HashMap<Integer, Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentManager{" +
                "students=" + students +
                '}';
    }

    @Override
    public void addStudent(Student student) {
        students.put(student.getNumberStudentCart(),student);
    }

    @Override
    public void deleteStudent(Student student) {
        if (students.containsKey(student.getNumberStudentCart())){
            students.remove(student.getNumberStudentCart());
        }else System.out.println(" Such a student " + student.getSurname() + " is not found ");
    }

    @Override
    public void searchStudentByNumberStudentCart(Integer numberStudentCart) {
        if ( students.containsKey(numberStudentCart)){
            System.out.println("find by id " + numberStudentCart +" -> " +  students.get(numberStudentCart));
        }else {
        System.out.println(" enter another number ");}
    }

    @Override
    public void addCourseForStudent(Student student, Course course) {
        if (students.containsKey(student.getNumberStudentCart())) {
            student.getCourses().add(course.getTitleCourse());
            course.getStudents().add(student);
            System.out.println( " Student " + student.getSurname() + " added to the course " + course.getTitleCourse());
        } else {System.out.println( " Such a student " + student.getSurname() + " is not found ");}
    }


    @Override
    public void getStudentInCourse(Course course) {
        System.out.println( course.getStudents());
    }


}
