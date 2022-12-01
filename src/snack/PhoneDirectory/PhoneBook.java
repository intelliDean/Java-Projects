package snack.PhoneDirectory;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List<Contact> contacts;
    private static int idCounter = 0;

    public PhoneBook() {
        contacts = new ArrayList<>();
        idCounter = 0;
    }

    public void addContact(Contact contact) {
        contact.setId(++PhoneBook.idCounter);
        this.contacts.add(contact);
    }

    public List<Contact> getAllContact() {
        return contacts;
    }

    public Contact getContactById(int id) {
        Contact toReturn = null;

        for (Contact eachContact : contacts) {
            if (eachContact.getId() == id) {
                toReturn = eachContact;
                break;
            }
        }

        if (toReturn == null) throw new ContactNotFoundException();
        return toReturn;
    }

    public void editContactName(int id, String name) {
        Contact contact = getContactById(id);
        contact.setName(name);
    }

    public void updateContactEmail(int id, String email) {
        Contact contact = getContactById(id);
        contact.setEmail(email);
    }

    public void updateContactTelephone(int id, String telephone) {
        Contact contact = getContactById(id);
        contact.setTelephone(telephone);
    }

    public void updateContactAddress(int id, Address newAddress) {
        Contact contact = getContactById(id);
        contact.setAddress(newAddress);
    }

    public void delete(int id) {
        Contact contact = getContactById(id);

        int index = 0;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).equals(contact)) {
                index = i;
                break;
            }
        }
        contacts.remove(index);
    }
}
