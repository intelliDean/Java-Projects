package Practice.drivers;

import Practice.StudentMutable;

import java.security.SecureRandom;

public class StudentMutableDriver {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        int ssn = 1 + rand.nextInt(10);
        StudentMutable student = new StudentMutable(ssn, "John");
        java.util.Date dateCreated = student.getDateCreated();
        dateCreated.setTime(200000); // Now dateCreated field is changed!


    }
}
