package lesson30.homework;

import java.util.HashSet;
import java.util.LinkedList;

/*
Задача: Написать метод, который принимает на вход список (LinkedList) строк и возвращает новый список,
    состоящий только из уникальных значений из первоначального списка.
 */
public class Task1 {

    public LinkedList<String> set (LinkedList<String> list){
        HashSet<String> set = new HashSet<>(list);
        return new LinkedList<String>(set);
    }

    public static void main(String[] args) {

        Task1 task1 = new Task1();

        LinkedList<String> list = new LinkedList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("1");

        System.out.println(list);

        System.out.println(task1.set(list));

    }

}
