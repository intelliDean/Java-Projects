package DiaryProject.Data.repositories;

import DiaryProject.Data.models.Contact;
import DiaryProject.Data.models.Phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhonebookRepoImpl implements RepoOfPhonebook{

    private List<Phonebook> phonebooks = new ArrayList<>();
    @Override
    public Phonebook save(Phonebook phonebook) {
        //check for phonebook
        //if exist, update
        //else, create
        Phonebook saved = findById(phonebook.getOwnersPhoneNumber());
        if (saved == null) {
        phonebooks.add(phonebook);
        } else {
            updatePhonebook(phonebook, saved);
        }

        return phonebook;
    }

    private void updatePhonebook(Phonebook phonebook, Phonebook saved) {
        saved.setOwnersName(phonebook.getOwnersName());
        saved.setContact(phonebook.getContact());
        saved.setOwnersPhoneNumber((phonebook.getOwnersPhoneNumber()));
    }

    @Override
    public void delete(Phonebook phonebook) {

    }

    @Override
    public int count() {
        return phonebooks.size();
    }

    @Override
    public Phonebook findById(String s) {
        for (Phonebook phonebook : phonebooks) {
            String stored = phonebook.getOwnersPhoneNumber();
            boolean phoneNumberMatches = stored.equals(s);
            if(phoneNumberMatches) {
                return phonebook;
            }
        }
        return null;
}


}