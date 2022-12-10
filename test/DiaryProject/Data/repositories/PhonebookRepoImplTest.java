package DiaryProject.Data.repositories;

import DiaryProject.Data.models.Phonebook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookRepoImplTest {
    RepoOfPhonebook repo = new PhonebookRepoImpl();

    @BeforeEach
    void setUp() {
        repo = new PhonebookRepoImpl();
    }
    @Test
    void addContactToPhoneRepo() {
        Phonebook phonebook = new Phonebook();
        phonebook.setOwnersName("Dean");
        phonebook.setOwnersPhoneNumber("0909");
        repo.save(phonebook);
        Phonebook newPhonebook = new Phonebook();
        newPhonebook.setOwnersName("Dean");
        newPhonebook.setOwnersPhoneNumber("0907");
        repo.save(newPhonebook);
        assertEquals(2, repo.count());
    }
    @Test
    void findContactById() {
        Phonebook phonebook = new Phonebook();
        phonebook.setOwnersName("Dean");
        phonebook.setOwnersPhoneNumber("0909");
        repo.save(phonebook);
    }
    @Test
    void updateContactOnlyWorkWithDifferentPhoneNumber() {
        Phonebook phonebook = new Phonebook();
        phonebook.setOwnersName("Dean");
        phonebook.setOwnersPhoneNumber("0909");
        repo.save(phonebook);
        Phonebook newPhonebook = new Phonebook();
        newPhonebook.setOwnersName("Michael");
        newPhonebook.setOwnersPhoneNumber("0909");
        repo.save(newPhonebook);
        assertEquals(1, repo.count());
        assertEquals("Michael", phonebook.getOwnersName());
    }
    @Test
    void deleteContactFromPhonebookRepo() {
        Phonebook phonebook = new Phonebook();
        phonebook.setOwnersName("Dean");
        phonebook.setOwnersPhoneNumber("0909");
        repo.save(phonebook);
        Phonebook newPhonebook = new Phonebook();
        newPhonebook.setOwnersName("Dean");
        newPhonebook.setOwnersPhoneNumber("0907");
        repo.save(newPhonebook);
        assertEquals(2, repo.count());
        repo.delete(phonebook);
        assertEquals(1, repo.count());
    }
}