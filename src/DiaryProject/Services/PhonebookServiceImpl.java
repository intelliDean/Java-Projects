package DiaryProject.Services;

import DiaryProject.Data.models.Contact;
import DiaryProject.Data.models.Phonebook;
import DiaryProject.Data.repositories.PhonebookRepoImpl;
import DiaryProject.Data.repositories.RepoOfPhonebook;

public class PhonebookServiceImpl implements PhonebookService{
RepoOfPhonebook repo = new PhonebookRepoImpl();
    @Override
    public void register(String ownersName, String ownersPhoneNumber) {
        Phonebook savePhonebook = repo.findById(ownersPhoneNumber);
        if (savePhonebook != null) {
            throw new IllegalArgumentException("user already exist");
        }
        Phonebook newPhonebook = new Phonebook();
        newPhonebook.setOwnersPhoneNumber(ownersPhoneNumber);
        newPhonebook.setOwnersName(ownersName);
        repo.save(newPhonebook);


    }

    @Override
    public void addContact(String OwnersPhoneNumber, String name, String phoneNumber) {

    }

    @Override
    public Contact findContact(String ownersPhoneNumber, String phoneNumberToSearchFor) {
        return null;
    }

    @Override
    public void delete() {

    }

    @Override
    public void updateContact() {

    }

    @Override
    public long numberOfUser() {
        return 0;
    }
}
