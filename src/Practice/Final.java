package Practice;

import java.util.Date;

public class Final {
    private final String name;
    private final int age;
    private java.util.Date dateOfBirth;

    public Final(String name, int age) {
        this.name = name;
        this.age = age;
        dateOfBirth = new java.util.Date();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}