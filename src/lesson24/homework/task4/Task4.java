package lesson24.homework.task4;

import java.util.HashMap;
import java.util.Iterator;

/*
Отслеживание оценок студентов:**
    - Создайте `HashMap`, где ключом является имя студента, а значением - его средний балл.
    - Добавьте данные пяти студентов.
    - Найдите и выведите имя студента с наивысшим средним баллом.
    - Измените средний балл одного из студентов и выведите обновленные данные.
 */
public class Task4 {
    public static void main(String[] args) {

        Repository repository = new Repository();
        Service service = new Service(repository);

        repository.addStudent(new Student("Gena" ,4.3));
        repository.addStudent(new Student("Sasha",4.5));
        repository.addStudent(new Student("Petya",5.0));
        repository.addStudent(new Student("Sweta",2.5));
        repository.addStudent(new Student("Vova",3.5));

        System.out.println(repository);

        System.out.println(service.maxGrade() + " have max grade ");

        service.changeValue("Sweta",3.3);

        System.out.println(repository);





    }

}