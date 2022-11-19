package Practice.Person;

import chapter8.DatePackage.Date;

public class Person {
    private String name;
    private String phoneNumber;
    private int age;
    private Date dateOfBirth;


    public Person(String name, String phoneNumber, int age, int day, int month) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.dateOfBirth = new Date(day, month);
    }
    public Person(String name, String phoneNumber, int age, Date date) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.dateOfBirth = date;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format("%n%s%n%-15s: %-15s%n%-15s: %-15s%n%-15s: %-15s%n%-15s: %-15d%n",
                "Your Information are as follows", "Name", name, "Phone Number", phoneNumber, "Date of Birth", dateOfBirth, "Age", age);
    }
}
