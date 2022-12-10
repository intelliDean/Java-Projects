package DiaryProject.Data.models;

import DiaryProject.Data.repositories.RepoOfContact;

import java.util.ArrayList;
import java.util.List;

public class Phonebook implements RepoOfContact {
    private String ownersName;
    private String ownersPhoneNumber;
    private List<Contact> contacts = new ArrayList<>();

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public String getOwnersPhoneNumber() {
        return ownersPhoneNumber;
    }

    public void setOwnersPhoneNumber(String ownersPhoneNumber) {
        this.ownersPhoneNumber = ownersPhoneNumber;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public Contact save(Contact contact) {
        Contact found = findById(contact.getPhoneNumber());
        if (found == null) {
        contacts.add(contact);
        } else {
            found.setName(found.getName());
        }
        return contact;
    }

    @Override
    public int count() {
        return contacts.size();
    }

    @Override
    public void delete(Contact contact) {
        Contact deleted = findById(contact.getPhoneNumber());
        if (deleted != null) {
            contacts.remove(deleted);
        }
    }

    @Override
    public Contact  findById(String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        return null;
    }
}
