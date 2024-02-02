package lesson30.homework.task6;

import java.util.ArrayList;

/*
6.  Создать класс Person с полями name и age. Создать ArrayList с объектами класса Person и отсортировать его
по возрасту в порядке возрастания

 */
public class Task6 {
    public static void main(String[] args) {

        Person person1 = new Person("John" , 25);
        Person person2 = new Person("Sweta" , 30);
        Person person3 = new Person("Petr" , 10);
        Person person4 = new Person("Mark" , 15);
        Person person5 = new Person("Anna" , 47);

        ArrayList <Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        System.out.println(persons);

        persons.sort(Person::compareTo);

        System.out.println(persons);


    }
}
