package lesson26.homework.task1;

import lesson24.homework.task5.Repository;

import javax.swing.plaf.PanelUI;
import java.util.HashMap;

public class ContactManager {

    private RepositoryContacts contacts;

    public ContactManager(RepositoryContacts contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        if (contacts.getContacts().put(contact.getPhoneNumber(), contact.getName()) == null) {
            contacts.getContacts().put(contact.getPhoneNumber(), contact.getName());
            System.out.println(" contact add ");
        } else System.out.println(" contact not unique ");
    }

    public void removeContact (Contact contact){
        contacts.getContacts().remove(contact.getPhoneNumber());
    }

    public HashMap<String, String> getContacts (RepositoryContacts contacts ){
        return contacts.getContacts();
    }
    public String getContactByPhoneNumber (String phoneNumber ){
        return contacts.getContacts().get(phoneNumber);
    }

    public String getContactByName (String name){
        return contacts.getContacts().getOrDefault(name,"enter other name");
    }
}
