package DiaryProject.Services;

import DiaryProject.Data.models.Contact;

public interface PhonebookService {
    void register();
    void addContact();
    Contact findContact();
    void delete();
    void updateContact();
}
