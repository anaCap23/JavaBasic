package oop.week1.contactlist;

public class TestContactList {
    public static void main(String[] args) {

        Contact contact1 = new Contact("Sam", "012345", "Life");
        Contact contact2 = new Contact("Dean", "123456", "Kie");
        Contact contact3 = new Contact("Dave", "234567", "Life");
        Contact contact4 = new Contact("Max", "345678", "Life");
        Contact contact5 = new Contact("Tay", "456789", "Kie");
        Contact contact6 = new Contact("Kieth", "456789", "Kie");
        Contact contact7 = new Contact("Jak", "456789", "Kie");

        ContactList contactList = new ContactList();

        contactList.addContact(contact1);
        Contact found = contactList.findContact("012345");
        System.out.println(found);
        contactList.removeLast();
        Contact foundAfter = contactList.findContact("012345");
        System.out.println(foundAfter == null);

        contactList.addContact(contact2);
        contactList.removeContactByNumber("123456");
        foundAfter = contactList.findContact("123456");
        System.out.println(foundAfter == null);

        contactList.addContact(contact3);
        contactList.addContact(contact4);
        contactList.addContact(contact5);
        contactList.showFirstFiveContacts();

        contactList.showLifeContacts();


    }

}