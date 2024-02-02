package lesson26.homework.task1;
/*
Задача: Управление списком контактов

Описание: Вам необходимо реализовать систему управления списком контактов.
Каждый контакт представлен в виде объекта Contact с полями name (имя) и phoneNumber (номер телефона).
Вам нужно использовать коллекцию для хранения контактов, чтобы гарантировать
уникальность каждого контакта на основе его имени и номера телефона.


public class Contact {
private String name;
private String phoneNumber;}

Требования:

    Реализовать класс Contact с полями name (тип данных String) и phoneNumber (тип данных String).
    Реализовать класс ContactManager, который будет управлять списком контактов.
    Класс ContactManager должен содержать следующие методы:
        addContact(Contact contact): добавляет контакт в список. Если контакт с таким именем и
        номером телефона уже существует, необходимо выдать сообщение об ошибке.
        removeContact(Contact contact): удаляет контакт из списка.
        getContacts(): возвращает список всех контактов.
        getContactByName(String name): возвращает контакт по имени.
        getContactByPhoneNumber(String phoneNumber): возвращает контакт по номеру телефона.

 */
public class Task1 {
    public static void main(String[] args) {
        RepositoryContacts repositoryContacts = new RepositoryContacts();
        ContactManager contactManager = new ContactManager(repositoryContacts);
        Contact contact1 = new Contact("222","petya");

        contactManager.addContact(new Contact("111","sasha"));
        contactManager.addContact(contact1);
        contactManager.addContact(new Contact("333","dasha"));
        contactManager.addContact(new Contact("111","sasha"));

        System.out.println(contactManager.getContacts(repositoryContacts));

        contactManager.removeContact(contact1);
        System.out.println(contactManager.getContacts(repositoryContacts));

        System.out.println(contactManager.getContactByName("333"));

        System.out.println(contact1);
    }
}
