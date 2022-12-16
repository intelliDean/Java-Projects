package Practice.Person;

import chapter8.DatePackage.Date;

public class Person {
    private String name;
    private String phoneNumber;
    private Date dateOfBirth;


    public Person(String name, String phoneNumber, int day, int month) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = new Date(day, month);
    }
    public Person(String name, String phoneNumber, Date date) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = date;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format("%n%s%n%-15s: %-15s%n%-15s: %-15s%n%-15s: %-15s%n",
                "Your Information are as follows", "Name", name, "Phone Number", phoneNumber, "Date of Birth", dateOfBirth);
    }
}
