package Practice;

import java.security.SecureRandom;

public class StudentMutable {
    private SecureRandom id;
    private String name;
    private java.util.Date dateCreated;

    public StudentMutable(int ssn, String newName) {
         id = new SecureRandom();
         name = newName;
         dateCreated = new java.util.Date();
    }

    public SecureRandom getId() {
         return id;
    }

    public String getName() {
         return name;
    }

    public java.util.Date getDateCreated() {
         return dateCreated;
    }
}
