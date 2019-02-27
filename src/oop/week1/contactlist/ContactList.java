package oop.week1.contactlist;

public class ContactList {

    private int freePlace = 0; //5
    Contact[] contacts = new Contact[1000000];

    public void addContact(Contact contact) {

        contacts[freePlace++] = contact;
    }

    public void removeLast() {
        contacts[--freePlace] = null;
    }

    public Contact findContact(String numberToFind) {
        for (int i = 0; i < freePlace; i++) {
            if (contacts[i].getNumber().equals(numberToFind)) {
                return contacts[i];
            }
        }

        return null;
    }

    public void removeContactByNumber(String numberToRemove) {
        for (int i = 0; i < freePlace; i++) {
            if (contacts[i].getNumber().equals(numberToRemove)) {
                contacts[i] = contacts[freePlace - 1];
                removeLast();
            }
        }
    }

    public void showFirstFiveContacts() {
        for (int i = 0; i < 5 && i < freePlace; i++) {
            System.out.println(contacts[i].getNumber() + " " + contacts[i].getName());

        }
    }

    public void showLastFiveContacts() {
        for (int i = contacts.length - 5; i < freePlace; i++) {
            System.out.println(contacts[i].getNumber() + " " + contacts[i].getName());
        }
    }

    public void showLifeContacts() {
        for (int i = 0; i < freePlace; i++) {
            if (contacts[i].getOperator().equals("Life")) {
                System.out.println(contacts[i].getNumber() + " " + contacts[i].getName());
            }
        }
    }
}