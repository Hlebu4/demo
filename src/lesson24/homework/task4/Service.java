package lesson24.homework.task4;

import java.util.HashMap;
import java.util.Map;

public class Service {

    private final Repository students;

    public Service(Repository students) {
        this.students = students;
    }

    public void addStudent (Student student){
        students.getStudents().put(student.getName() , student.getAverageGrade());
    }

    public String maxGrade(){
        String findKey = "";
        double maxGrade = 0.0;
        for(Map.Entry<String, Double> entry: students.getStudents().entrySet()){
            if(maxGrade < entry.getValue()){
                maxGrade = entry.getValue();
                findKey = entry.getKey();
            }
        }
        return findKey;
    }
    public void changeValue (String key , Double neuValue){
        if(students.getStudents().containsKey(key)){
            students.getStudents().put(key,neuValue);
        }
    }
}
