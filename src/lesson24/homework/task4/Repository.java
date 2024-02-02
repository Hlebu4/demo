package lesson24.homework.task4;

import java.util.HashMap;
import java.util.Map;

public class Repository {

    private HashMap <String,Double> students;

    public Repository() {
        this.students = new HashMap<>();
    }

    public void addStudent (Student student){
        students.put(student.getName() , student.getAverageGrade());
    }


    public HashMap<String, Double> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "students=" + students +
                '}';
    }
}
