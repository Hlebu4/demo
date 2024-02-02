package lesson30.homework;

import java.util.HashMap;

/*
Создать карту HashMap, в которой хранятся номера телефонов и фамилии людей.
По номеру телефона вывести фамилию:
 */
public class Task4 {
    public static void main(String[] args) {

        HashMap <Integer, String> contacts = new HashMap<>();

        contacts.put(111,"Vasya");
        contacts.put(222,"Sveta");
        contacts.put(333,"Vova");
        contacts.put(444,"Tanya");
        contacts.put(555,"John");

        System.out.println( contacts.getOrDefault(222, "такого объекта нет "));
        System.out.println( contacts.getOrDefault(234, "такого объекта нет "));
    }
}
