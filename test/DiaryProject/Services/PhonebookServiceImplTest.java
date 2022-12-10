package DiaryProject.Services;

import DiaryProject.Data.models.Contact;
import DiaryProject.Data.models.Phonebook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookServiceImplTest {
    PhonebookService phoneService;

    @BeforeEach
    void setUp() {
        phoneService = new PhonebookServiceImpl();
    }
    @Test
    void registerUser() {
        phoneService.register("Dean", "0909");
        assertEquals(1, phoneService.numberOfUser());

    }
    @Test
    void registerMethodThrowsExceptionForDuplicatedRegistration() {
        phoneService.register("Dean", "0909");
        assertEquals(1, phoneService.numberOfUser());
        assertThrows(IllegalArgumentException.class,
                ()-> phoneService.register("Michael", "0909"));
    }
    @Test
    void addContact() {
        phoneService.addContact("0909", "myFriend", "1234");
        assertEquals(1, phoneService.numberOfContacts());
    }
    @Test
    void findContactInTheContactRepo() {
        phoneService.register("Dean", "0909");
        assertEquals(1, phoneService.numberOfUser());
        phoneService.addContact("0909", "myFriend", "1234");
        assertEquals(1, phoneService.numberOfContacts());
        Contact contact = phoneService.findContact("0909", "1234");
        assertEquals("1234", contact.getPhoneNumber());
        //assertNotNull(phoneService.findContact("0909", "1234"));
    }
    @Test
    void deleteContact() {
        phoneService.register("Dean", "0909");
        assertEquals(1, phoneService.numberOfUser());
        phoneService.addContact("0909", "myFriend", "1234");
        phoneService.addContact("0909", "myOtherFriend", "5678");
        phoneService.addContact("0909", "myOtherFriend2", "5698");
        assertEquals(3, phoneService.numberOfContacts());
        phoneService.delete();
    }

}