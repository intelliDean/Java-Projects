package truecaller_project.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import truecaller_project.data.models.Contact;
import truecaller_project.dtos.request.ContactRequest;

import static org.junit.jupiter.api.Assertions.*;

class ContactServicesImplTest {
    ContactServices services;
    ContactRequest request;

    @BeforeEach
    void setUp() {
        services = new ContactServicesImpl();
        request = new ContactRequest();
    }

    @Test
    void saveContact() {
        request.setName("Dean");
        request.setPhoneNumber("2343");
        services.saveContact(request);

        assertEquals(1, services.numberOfContacts());
    }

    @Test
    void findContactById() {
        request.setName("Dean");
        request.setPhoneNumber("2343");
        services.saveContact(request);

        ContactRequest req = new ContactRequest();
        req.setName("Mike");
        req.setPhoneNumber("2153");
        services.saveContact(req);

        assertEquals(2, services.numberOfContacts());

        Contact contact = services.findContact(req);
        assertEquals("2153", contact.getContactNumber());
    }

    @Test
    void idIsUnique() {
        request.setName("Dean");
        request.setPhoneNumber("2343");
        services.saveContact(request);

        ContactRequest req = new ContactRequest();
        req.setId(1);
        req.setName("Mike");
        req.setPhoneNumber("2153");
        services.saveContact(req);

        assertEquals(1, services.numberOfContacts());
    }

    @Test
    void updateContact() {
        request.setName("Dean");
        request.setPhoneNumber("2343");
        services.saveContact(request);

        assertEquals(1, request.getId());

        ContactRequest req = new ContactRequest();
        req.setId(1);
        req.setName("Mike");
        req.setPhoneNumber("2153");
        services.updateContact(req);

        assertEquals(1, req.getId());

        assertEquals(1, services.numberOfContacts());
        Contact contact = services.findContact(request);
        assertEquals("Mike", contact.getContactName());
    }

    @Test
    void deleteContactById() {
        request.setName("Dean");
        request.setPhoneNumber("2343");
        services.saveContact(request);

        ContactRequest req = new ContactRequest();
        req.setName("Mike");
        req.setPhoneNumber("2123");
        services.saveContact(req);

        assertEquals(2, services.numberOfContacts());

        services.delete(2);

        assertEquals(1, services.numberOfContacts());
    }

    @Test
    void deleteContactObject() {
        request.setName("Dean");
        request.setPhoneNumber("2343");
        services.saveContact(request);

        ContactRequest req = new ContactRequest();
        req.setName("Mike");
        req.setPhoneNumber("2123");
        services.saveContact(req);

        assertEquals(2, services.numberOfContacts());
        Contact contact = services.findContact(request);

        services.delete(contact);

        assertEquals(1, services.numberOfContacts());
    }

    @Test
    void deleteAllContacts() {
        request.setName("Dean");
        request.setPhoneNumber("2343");
        services.saveContact(request);

        ContactRequest req = new ContactRequest();
        req.setName("Mike");
        req.setPhoneNumber("2123");
        services.saveContact(req);

        assertEquals(2, services.numberOfContacts());
        Contact contact = services.findContact(request);

        services.delete(contact);

        assertEquals(1, services.numberOfContacts());

        ContactRequest reck = new ContactRequest();
        reck.setName("Lean");
        reck.setPhoneNumber("2233");
        services.saveContact(reck);

        ContactRequest real = new ContactRequest();
        real.setName("Michael");
        real.setPhoneNumber("3123");
        services.saveContact(real);

        assertEquals(3, services.numberOfContacts());
        assertEquals(3, reck.getId());

        services.deleteAll();

        assertEquals(0, services.numberOfContacts());
    }
}