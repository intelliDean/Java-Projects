package truecaller_project.data.repositories;

import truecaller_project.data.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactRepoImpl implements ContactRepo {
    private List<Contact> contacts = new ArrayList<>();
    private int idInitializer;

    @Override
    public Contact save(Contact contact) {
        if (contact.getContactId() == 0) {
            contact.setContactId(++idInitializer);
            contacts.add(contact);
        } else {
            updateContact(contact);
        }
        return contact;
    }

    private void updateContact(Contact contact) {
        Contact updateContact = findById(contact.getContactId());   //use the new information to populate the existing contact
        updateContact.setContactNumber(contact.getContactNumber());
        updateContact.setContactName(contact.getContactName());
    }

    @Override
    public Contact findById(int id) {
        for (Contact contact : contacts) {
            if (contact.getContactId() == id) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public void delete(Contact contact) {
        contacts.remove(contact);
    }

    @Override
    public void delete(int id) {
        contacts.removeIf(contact->contact.getContactId() == id);
    }

    @Override
    public long numberOfContacts() {
        return contacts.size();
    }

    @Override
    public void deleteAll() {
        contacts.removeAll(allContacts());
    }
    public List<Contact> allContacts() {
        return contacts;
    }
}
