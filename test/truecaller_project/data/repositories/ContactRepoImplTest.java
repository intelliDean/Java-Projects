package truecaller_project.data.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import truecaller_project.data.models.Contact;

import static org.junit.jupiter.api.Assertions.*;

class ContactRepoImplTest {
    ContactRepo repo;

    @BeforeEach
    void setUp() {
        repo = new ContactRepoImpl();
    }

    @Test
    void addContactToContactRepo() {
        Contact contact = new Contact();
        contact.setContactName("Dean");
        contact.setContactNumber("1234");
        repo.save(contact);

        assertEquals(1, repo.numberOfContacts());
        assertEquals("1234", contact.getContactNumber());
    }

    @Test
    void findById() {
        Contact contact = new Contact();
        contact.setContactName("Dean");
        contact.setContactNumber("1234");
        repo.save(contact);

        Contact contact1 = new Contact();
        contact1.setContactName("MDean");
        contact1.setContactNumber("0099");
        repo.save(contact1);

        Contact contact2 = repo.findById(2);
        assertEquals(contact1, contact2);
        assertEquals(2, contact2.getContactId());
    }

    @Test
    void idIsUniqueToOneContactAlone() {
        Contact contact = new Contact();
        contact.setContactName("Dean");
        contact.setContactNumber("1234");
        repo.save(contact);

        Contact contact1 = new Contact();
        contact1.setContactId(1);
        contact1.setContactName("MDean");
        contact1.setContactNumber("0099");
        repo.save(contact1);

        assertEquals(1, repo.numberOfContacts());
        assertEquals("MDean", contact1.getContactName());
    }

    @Test
    void updateContact() {
        Contact contact = new Contact();
        contact.setContactName("Dean");
        contact.setContactNumber("1234");
        repo.save(contact);

        Contact contact1 = new Contact();
        contact1.setContactId(1);
        contact1.setContactName("MDean");
        contact1.setContactNumber("0099");
        repo.save(contact1);

        assertEquals(1, repo.numberOfContacts());
        assertEquals("MDean", contact.getContactName());
    }

    @Test
    void deleteContactById() {
        Contact contact = new Contact();
        contact.setContactName("Dean");
        contact.setContactNumber("1234");
        repo.save(contact);

        Contact contact1 = new Contact();
        contact1.setContactName("MDean");
        contact1.setContactNumber("0099");
        repo.save(contact1);

        assertEquals(2, repo.numberOfContacts());

        repo.delete(2);
        assertEquals(1, repo.numberOfContacts());
    }
    @Test
    void deleteContactByContact() {
        Contact contact = new Contact();
        contact.setContactName("Dean");
        contact.setContactNumber("1234");
        repo.save(contact);

        Contact contact1 = new Contact();
        contact1.setContactName("MDean");
        contact1.setContactNumber("0099");
        repo.save(contact1);

        assertEquals(2, repo.numberOfContacts());

        repo.delete(contact);
        assertEquals(1, repo.numberOfContacts());
    }
    @Test
    void saveThreeContactsDeleteTwoSaveAnotherContact() {
        Contact contact = new Contact();
        contact.setContactName("Dean");
        contact.setContactNumber("1234");
        repo.save(contact);

        Contact contact1 = new Contact();
        contact1.setContactName("MDean");
        contact1.setContactNumber("0099");
        repo.save(contact1);

        Contact contact2 = new Contact();
        contact2.setContactName("MDean");
        contact2.setContactNumber("0099");
        repo.save(contact2);

        assertEquals(3, repo.numberOfContacts());

        repo.delete(1);
        repo.delete(contact1);

        assertEquals(1, repo.numberOfContacts());

        Contact contact3 = new Contact();
        contact3.setContactName("MDean");
        contact3.setContactNumber("0099");
        repo.save(contact3);

        assertEquals(2, repo.numberOfContacts());
    }
     @Test
    void deleteAll() {
        Contact contact = new Contact();
        contact.setContactName("Dean");
        contact.setContactNumber("1234");
        repo.save(contact);

        Contact contact1 = new Contact();
        contact1.setContactName("MDean");
        contact1.setContactNumber("0099");
        repo.save(contact1);

        Contact contact2 = new Contact();
        contact2.setContactName("MDean");
        contact2.setContactNumber("0099");
        repo.save(contact2);

        assertEquals(3, repo.numberOfContacts());

        repo.delete(1);
        repo.delete(contact1);

        assertEquals(1, repo.numberOfContacts());

        Contact contact3 = new Contact();
        contact3.setContactName("MDean");
        contact3.setContactNumber("0099");
        repo.save(contact3);

        assertEquals(2, repo.numberOfContacts());

        repo.deleteAll();

        assertEquals(0, repo.numberOfContacts());
    }

}