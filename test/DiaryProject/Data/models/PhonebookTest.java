package DiaryProject.Data.models;

import DiaryProject.Data.repositories.RepoOfContact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookTest {
    RepoOfContact contactRepo;

    @BeforeEach
    void setUp() {
        //contactRepo = new Phonebook();
    }
    @Test
    void saveContactIntoContactRepo() {
        Contact contact = new Contact();
        contact.setName("Dean");
        contact.setPhoneNumber("9900");
        contactRepo.save(contact);
        assertEquals(1, contactRepo.count());
        assertEquals("Dean", contact.getName());
    }
    @Test
    void findContactByIdInTheContactRepo() {
        Contact contact = new Contact();
        contact.setName("Dean");
        contact.setPhoneNumber("9900");
        contactRepo.save(contact);
        Contact newContact = new Contact();
        newContact.setName("Michael");
        newContact.setPhoneNumber("9943");
        contactRepo.save(newContact);
        assertEquals(2, contactRepo.count());
        assertEquals(newContact, contactRepo.findById("9943"));
    }
    @Test
    void updateContactUsingPhoneNumberAsItsId() {
        Contact contact = new Contact();
        contact.setName("Dean");
        contact.setPhoneNumber("9900");
        contactRepo.save(contact);
        Contact newContact = new Contact();
        newContact.setName("Michael");
        newContact.setPhoneNumber("9900");
        contactRepo.save(newContact);
        assertEquals(1, contactRepo.count());
        assertEquals("Michael", newContact.getName());
    }
    @Test
    void deleteContactFromContactRepo() {
        Contact contact = new Contact();
        contact.setName("Dean");
        contact.setPhoneNumber("9900");
        contactRepo.save(contact);
        Contact newContact = new Contact();
        newContact.setName("Michael");
        newContact.setPhoneNumber("9943");
        contactRepo.save(newContact);
        assertEquals(2, contactRepo.count());
        contactRepo.delete(newContact);
        assertEquals(1, contactRepo.count());
    }

}