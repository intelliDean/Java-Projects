package DiaryProject.Data.repositories;

import DiaryProject.Data.models.Contact;

public class ContactRepoImpl implements RepoOfContact{
    @Override
    public Contact save(Contact contact) {
//        Contact found = findById(contact.getPhoneNumber());
//        if (found == null) {
//        contacts.add(contact);
//        } else {
//            found.setName(found.getName());
//        }
       return contact;
    }

    @Override
    public int count() {
        //return contacts.size();
        return 0;
    }

    @Override
    public void delete(Contact contact) {
//        Contact deleted = findById(contact.getPhoneNumber());
//        if (deleted != null) {
//            contacts.remove(deleted);
//        }
    }

    @Override
    public Contact  findById(String phoneNumber) {
//        for (Contact contact : contacts) {
//            if (contact.getPhoneNumber().equals(phoneNumber)) {
//                return contact;
//            }
//        }
        return null;
    }
}
