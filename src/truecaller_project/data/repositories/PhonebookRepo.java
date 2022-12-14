package truecaller_project.data.repositories;

import truecaller_project.data.models.Phonebook;

public interface PhonebookRepo {
    Phonebook save(Phonebook phonebook);
    Phonebook findById(int id);
    void delete(Phonebook phonebook);
    void delete(int id);
    long numberOfPhonebooks();
}
