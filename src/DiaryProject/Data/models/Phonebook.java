package DiaryProject.Data.models;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private String ownersName;
    private String ownersPhoneNumber;
    private List<Contact> contact = new ArrayList<>();

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public String getOwnersPhoneNumber() {
        return ownersPhoneNumber;
    }

    public void setOwnersPhoneNumber(String ownersPhoneNumber) {
        this.ownersPhoneNumber = ownersPhoneNumber;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }
}
