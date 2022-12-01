package assignment.Crud_OP;

public class ContactNotFoundException extends RuntimeException {
    public ContactNotFoundException() {
        this("Contact not found");
    }

    public ContactNotFoundException(String message) {
        super(message);
    }
}
