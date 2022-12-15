package truecaller_project.services;


import truecaller_project.data.models.Contact;
import truecaller_project.dtos.request.ContactRequest;
import truecaller_project.dtos.request.PhonebookRequest;

import java.util.List;

public interface ContactServices {

    //void register(ContactRequest contactRequest);
    //void register(String ownersName, String OwnersPhoneNumber);
    void saveContact(ContactRequest contactRequest);
    //void addContact(String name, String phoneNumber);
    Contact findContact(ContactRequest contactRequest);

    //Contact findContact(String ownersPhoneNumber, String phoneNumberToSearchFor);

    void delete(Contact contact);
    void delete(int id);     // delete by ID

    void updateContact(ContactRequest contactRequest);
    long numberOfContacts();
    void deleteAll();
    List<Contact> viewAll();
}
