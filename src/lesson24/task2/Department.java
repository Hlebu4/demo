package lesson24.task2;

public class Department {

    private Integer departmentNumber ;
    private String departmentName ;

    public Department(Integer departmentNumber, String departmentName) {
        this.departmentNumber = departmentNumber;
        this.departmentName = departmentName;
    }

    public Integer getDepartmentNumber() {
        return departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentNumber=" + departmentNumber +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
