package lesson24.homework.task4;

public class Student {

    private final String name;
    private Double averageGrade;

    public Student(String name, Double averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public Double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(Double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }
}
