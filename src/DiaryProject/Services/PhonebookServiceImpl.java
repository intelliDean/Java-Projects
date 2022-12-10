package DiaryProject.Services;

import DiaryProject.Data.models.Contact;
import DiaryProject.Data.models.Phonebook;
import DiaryProject.Data.repositories.PhonebookRepoImpl;
import DiaryProject.Data.repositories.RepoOfContact;
import DiaryProject.Data.repositories.RepoOfPhonebook;

public class PhonebookServiceImpl implements PhonebookService {
    RepoOfPhonebook phoneRepo = new PhonebookRepoImpl();
    RepoOfContact contactRepo = new Phonebook();

    @Override
    public void register(String ownersName, String ownersPhoneNumber) {
        Phonebook savePhonebook = phoneRepo.findById(ownersPhoneNumber);
        if (savePhonebook != null) {
            throw new IllegalArgumentException("user already exist");
        }
        Phonebook newPhonebook = new Phonebook();
        newPhonebook.setOwnersPhoneNumber(ownersPhoneNumber);
        newPhonebook.setOwnersName(ownersName);
        phoneRepo.save(newPhonebook);


    }

    @Override
    public void addContact(String ownersPhoneNumber, String name, String phoneNumber) {
        Contact serachedContact = contactRepo.findById(ownersPhoneNumber);
        if (serachedContact != null) {
            throw new IllegalArgumentException("contact exist already");
        } else {
            Contact newContact = new Contact();
            newContact.setPhoneNumber(phoneNumber);
            newContact.setName(name);
            contactRepo.save(newContact);
        }
    }

    @Override
    public Contact findContact(String ownersPhoneNumber, String phoneNumberToSearchFor) {
        contactRepo = phoneRepo.findById(ownersPhoneNumber);
        if (contactRepo == null) {
            throw new IllegalArgumentException("contact not found");
        } else {
        return contactRepo.findById(phoneNumberToSearchFor);
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void updateContact() {

    }

    @Override
    public long numberOfUser() {
        return phoneRepo.count();
    }

    @Override
    public long numberOfContacts() {
        return contactRepo.count();
    }
}
