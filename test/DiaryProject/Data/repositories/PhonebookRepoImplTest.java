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
        assertEquals(1, repo.count());
    }
}