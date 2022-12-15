package truecaller_project.services;

import snack.PhoneDirectory.PhoneBook;
import truecaller_project.data.models.Phonebook;
import truecaller_project.dtos.request.PhonebookRequest;

import java.util.List;

public interface PhonebookServices {
    void register(PhonebookRequest phonebookRequest);
    void savePhonebook(PhonebookRequest phonebookRequest);
    Phonebook findPhonebook(PhonebookRequest phonebookRequest);
    void updatePhonebook(PhonebookRequest phonebookRequest);
    void delete(PhoneBook phoneBook);
    void delete(int id);
    void deleteAllPhonebooks();
    long numberOfPhonebooks();
    List<Phonebook> viewAllPhonebook();




}
