package DiaryProject.Services;

import DiaryProject.Data.models.Contact;

public interface PhonebookService {
    void register(String ownersName, String OwnersPhoneNumber);
    void addContact(String OwnersPhoneNumber, String name, String phoneNumber);
    Contact findContact(String ownersPhoneNumber, String phoneNumberToSearchFor);
    void delete();
    void updateContact();
}
