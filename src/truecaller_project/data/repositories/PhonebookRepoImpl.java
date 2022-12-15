package truecaller_project.data.repositories;

import truecaller_project.data.models.Phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhonebookRepoImpl implements PhonebookRepo {
    private List<Phonebook> phonebooks = new ArrayList<>();
    private int idInitialization;

    @Override
    public Phonebook save(Phonebook phonebook) {
        if (phonebook.getUserId() == 0) {
        phonebook.setUserId(++idInitialization);
        phonebooks.add(phonebook);
        } else {
            updatePhonebook(phonebook);
        }
        return phonebook;
    }

    private void updatePhonebook(Phonebook phonebook) {
        Phonebook foundPhonebook = findById(phonebook.getUserId());
        foundPhonebook.setUsername(phonebook.getUsername());
        foundPhonebook.setUserPhoneNumber(phonebook.getUserPhoneNumber());
    }

    @Override
    public Phonebook findById(int id) {
        for (Phonebook phone : phonebooks) {
            if (phone.getUserId() == id) {
                return phone;
            }
        }
        return null;
    }

    @Override
    public void delete(Phonebook phonebook) {
        phonebooks.remove(phonebook);
    }

    @Override
    public void delete(int id) {
        phonebooks.removeIf(phonebook -> phonebook.getUserId() == id);
    }

    @Override
    public long numberOfPhonebooks() {
        return phonebooks.size();
    }

    @Override
    public void deleteAll() {

        phonebooks.removeAll(allPhonebooks());
    }
    private List<Phonebook> allPhonebooks() {
        return phonebooks;
    }
}
