package DiaryProject.Data.repositories;

import DiaryProject.Data.models.Contact;
import DiaryProject.Data.models.Phonebook;

public interface RepoOfPhonebook {
    Phonebook save(Phonebook phonebook);
    int count();
    void delete(Phonebook phonebook);
    Phonebook findById(String phoneNumber);
}
