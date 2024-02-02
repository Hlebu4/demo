package lesson24.task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2demo {
    public static void main(String[] args) {

        Map<Integer,Person> ourPerson = new HashMap<>();

        Person person1 = new Person("Vasil" , 01);
        Person person2 =  new Person("Sergey" , 02);
        Person person3 =  new Person("Svetlana" , 03);
        Person person4 =  new Person("Konstantin" , 04);

        ourPerson.put(person1.getIdPerson(), person1);
        ourPerson.put(person2.getIdPerson(), person2);
        ourPerson.put(person3.getIdPerson(),person3);
        ourPerson.put(person4.getIdPerson(),person4);


        System.out.println(ourPerson);

        Set<Department> ourDepartment = new HashSet<>();

        Department department1 = new Department(11 ,"Div");
        Department department2 = new Department(22 ,"Marketing");
        Department department3 = new Department(33 ,"HP");


        ourDepartment.add(department1);
        ourDepartment.add(department2);
        ourDepartment.add(department3);

        System.out.println(ourDepartment);

        Map<Integer , Department> company = new HashMap<>();

        company.put(person1.getIdPerson(), department1);
        company.put(person2.getIdPerson(), department2);
        company.put(person3.getIdPerson(), department3);
        company.put(person4.getIdPerson(), department1);

        System.out.println(company.get(person1.getIdPerson()));
    }
}
