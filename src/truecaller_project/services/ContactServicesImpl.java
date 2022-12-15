package truecaller_project.services;

import truecaller_project.data.models.Contact;
import truecaller_project.data.repositories.ContactRepo;
import truecaller_project.data.repositories.ContactRepoImpl;
import truecaller_project.dtos.request.ContactRequest;

import java.util.List;

public class ContactServicesImpl implements ContactServices {
    private ContactRepo repo = new ContactRepoImpl();
    private int idInitialization;

    @Override
    public void saveContact(ContactRequest contactRequest) {
        if (contactRequest.getId() == 0) {
            Contact contact = new Contact();
            contactRequest.setId(++idInitialization);
            contact.setContactName(contactRequest.getName());
            contact.setContactNumber(contactRequest.getPhoneNumber());
            repo.save(contact);
        }
    }

    @Override
    public void updateContact(ContactRequest contactRequest) {
        Contact contact = repo.findById(contactRequest.getId());
        if (contact != null) {
            contact.setContactName(contactRequest.getName());
            contact.setContactNumber(contactRequest.getPhoneNumber());
        }
    }

    @Override
    public Contact findContact(ContactRequest contactRequest) {
        return repo.findById(contactRequest.getId());
    }
    @Override
    public void delete(Contact contact) {
        repo.delete(contact);
    }
    @Override
    public void delete(int id) {
        repo.delete(id);

    }
    @Override
    public long numberOfContacts() {
        return repo.numberOfContacts();
    }
    @Override
    public void deleteAll() {
        repo.deleteAll();
    }
    @Override
    public List<Contact> viewAll() {
        return repo.allContacts();
    }
}
