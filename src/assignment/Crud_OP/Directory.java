package assignment.Crud_OP;


import java.util.ArrayList;
import java.util.List;

public class Directory {
    private List<Contact> contacts;
    private static int idCounter = 0;



    public Directory(Contact contact) {
        contacts = new ArrayList<>();
        idCounter = 0;
    }
    public Directory(){            //no args constructor
        contacts = new ArrayList<>();
        idCounter = 0;
    }

    public void addContact(Contact contact) {
        contact.setId(++Directory.idCounter);
        this.contacts.add(contact);
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }

    public Contact getContactById(int id) {
        Contact toReturn = null;

        for (Contact theContact : contacts) {
            if (theContact.getId() == id) {
                toReturn = theContact;
                break;
            }
        }

        if (toReturn == null) throw new ContactNotFoundException();
        return toReturn;
    }
    public static void displayHumans(List<Contact> contacts){
        for(Contact contact : contacts) {
            System.out.println(contact);
        }
    }
//    public void editContactFirstName(int id, String name) {
//        Contact contact = getContactById(id);
//        contact.setContact(name);
//    }
    //    public void editContactLastName(int id, String name) {
//        Contact contact = getContactById(id);
//        contact.setContact(name);
//    }
    public void editContactEmail(int id, String email) {
        Contact contact = getContactById(id);
        contact.setEmail(email);
    }
    public void editContactTelephone(int id, String phoneNumber) {
        Contact contact = getContactById(id);
        contact.setTelephone(phoneNumber);
    }
    public void editContactAddress(int id, Address newAddress) {
        Contact contact = getContactById(id);
        contact.setAddress(newAddress);
    }
    public void deleteContact(int id) {
        Contact contact = getContactById(id);

        for (Contact thisContact : contacts) {

            if (thisContact.equals(contact)) {
                contact = thisContact;
                contacts.remove(contact);
            }
        }
       // contacts.remove(contact);
    }

    public static void main(String[] args) {
        Directory info = new Directory();

        Contact dean = new Contact("Michael", "Dean",
                new Address("26", "Admiralty Way",
                "Lekki Phase 1", "Lagos", "Nigeria"),
                "08095729090","o.michaeldean@gmail.com");

        Contact sule = new Contact("Sule", "Maito",
                new Address("23", "Juno Street",
                        "Sabo, Yaba", "Lagos", "Nigeria"),
                "08091234323","alagasule@gmail.com");
        Contact mike = new Contact("Michael", "John",
                new Address("12","Raymond Street", "Yaba"),
                "08012345678", "maiko@mail.com");

        info.addContact(dean);
        info.addContact(sule);
        info.addContact(mike);
        info.editContactEmail(2, "guijllb");
        info.getContactById(3).setEmail("newEmail@gmail.com");

        displayHumans(info.getAllContacts());

        info.deleteContact(2);
        System.out.println(info.getContactById(2));

        //asserttthrows(ClassName.theexception, ()-> the method)

//        System.out.printf("%s%n%s%n",dean, sule);
        //displayHumans(info.getAllContacts());


        //System.out.println(info.getContactById(1).getAddress().getCity());


    }


}
