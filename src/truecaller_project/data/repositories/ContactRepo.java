package truecaller_project.data.repositories;

import truecaller_project.data.models.Contact;

import java.util.List;

public interface ContactRepo {
    Contact save(Contact contact);
    Contact findById(int id);
    void delete(Contact contact);
    void delete(int id);
    long numberOfContacts();
    void deleteAll();
    List<Contact> allContacts();
}