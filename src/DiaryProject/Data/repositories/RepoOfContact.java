package DiaryProject.Data.repositories;

import DiaryProject.Data.models.Contact;
import DiaryProject.Data.models.Phonebook;

public interface RepoOfContact {
    Contact save(Contact contact);
    int count();
    void delete(Contact contact);

    Contact findById(String phoneNumber);

}