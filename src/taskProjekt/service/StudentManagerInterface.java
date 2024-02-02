package taskProjekt.service;

import taskProjekt.entity.Course;
import taskProjekt.entity.Student;

public interface StudentManagerInterface {

    void addStudent (Student student);
    void deleteStudent (Student student);

    void searchStudentByNumberStudentCart (Integer numberStudentCart);

    void addCourseForStudent (Student student , Course course);

    void getStudentInCourse (Course course);
}
