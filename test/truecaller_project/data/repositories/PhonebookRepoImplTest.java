package truecaller_project.data.repositories;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import truecaller_project.data.models.Phonebook;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookRepoImplTest {
    PhonebookRepo repo;

    @BeforeEach
    void setUp() {
        repo = new PhonebookRepoImpl();
    }
    @Test
    void savePhonebookInThePhonebookRepo() {
        Phonebook phone = new Phonebook();
        phone.setUsername("Dean");
        phone.setUserPhoneNumber("1234");
        repo.save(phone);

        assertEquals(1, repo.numberOfPhonebooks());
    }
    @Test
    void findPhoneById() {
        Phonebook phone = new Phonebook();
        phone.setUsername("Dean");
        phone.setUserPhoneNumber("1234");
        repo.save(phone);

        Phonebook phone1 = new Phonebook();
        phone1.setUsername("Mike");
        phone1.setUserPhoneNumber("8890");
        repo.save(phone1);

        Phonebook foundPhonebook = repo.findById(1);
        assertEquals(phone, foundPhonebook);
        assertEquals("1234", foundPhonebook.getUserPhoneNumber());
    }
    @Test
    void idIsUniqueToAPhonebook() {
        Phonebook phone = new Phonebook();
        phone.setUsername("Dean");
        phone.setUserPhoneNumber("1234");
        repo.save(phone);

        Phonebook phone1 = new Phonebook();
        phone1.setUserId(1);
        phone1.setUsername("Mike");
        phone1.setUserPhoneNumber("8890");
        repo.save(phone1);

        assertEquals(1, repo.numberOfPhonebooks());
        assertEquals("Mike", phone1.getUsername());
    }
    @Test
    void updatePhonebook() {
        Phonebook phone = new Phonebook();
        phone.setUsername("Dean");
        phone.setUserPhoneNumber("1234");
        repo.save(phone);

        Phonebook phone1 = new Phonebook();
        phone1.setUserId(1);
        phone1.setUsername("Mike");
        phone1.setUserPhoneNumber("8890");
        repo.save(phone1);

        assertEquals(1, repo.numberOfPhonebooks());
        assertEquals("Mike", phone.getUsername());
    }
    @Test
    void deletePhonebookById() {
        Phonebook phone = new Phonebook();
        phone.setUsername("Dean");
        phone.setUserPhoneNumber("1234");
        repo.save(phone);

        Phonebook phone1 = new Phonebook();
        phone1.setUsername("Mike");
        phone1.setUserPhoneNumber("8890");
        repo.save(phone1);

        assertEquals(2, repo.numberOfPhonebooks());

        repo.delete(2);

        assertEquals(1, repo.numberOfPhonebooks());
    }
    @Test
    void deletePhonebookByObject() {
        Phonebook phone = new Phonebook();
        phone.setUsername("Dean");
        phone.setUserPhoneNumber("1234");
        repo.save(phone);

        Phonebook phone1 = new Phonebook();
        phone1.setUsername("Mike");
        phone1.setUserPhoneNumber("8890");
        repo.save(phone1);

        assertEquals(2, repo.numberOfPhonebooks());

        repo.delete(phone);

        assertEquals(1, repo.numberOfPhonebooks());
    }
    @Test
    void deleteAllPhonebooks() {
        Phonebook phone = new Phonebook();
        phone.setUsername("Dean");
        phone.setUserPhoneNumber("1234");
        repo.save(phone);

        Phonebook phone1 = new Phonebook();
        phone1.setUsername("Mike");
        phone1.setUserPhoneNumber("8890");
        repo.save(phone1);

        Phonebook phone2 = new Phonebook();
        phone2.setUsername("Mike");
        phone2.setUserPhoneNumber("8890");
        repo.save(phone2);

        assertEquals(3, repo.numberOfPhonebooks());

        repo.delete(phone);

        assertEquals(2, repo.numberOfPhonebooks());

        Phonebook phone3 = new Phonebook();
        phone3.setUsername("Mike");
        phone3.setUserPhoneNumber("8890");
        repo.save(phone3);

        assertEquals(3, repo.numberOfPhonebooks());

        repo.deleteAll();

        assertEquals(0, repo.numberOfPhonebooks());
    }

}