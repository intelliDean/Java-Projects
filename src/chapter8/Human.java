package chapter8;

import MyReusableCodes.CapitaliseForLetter;

public class Human {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;



    public Human(String firstName) {
        this(firstName, 0);
    }
    public Human(String firstName, int age) {
        this(firstName, age, null);
    }
    public Human(String firstName, String phoneNumber) {
        this(firstName, 0, phoneNumber);
    }
    public Human(String firstName, int age, String phoneNumber) {
        this(firstName, null, age, phoneNumber);
    }
    public Human(String firstName, String lastName, int age, String phoneNumber) {
        validateAge(age);
        validatePhoneNumber(phoneNumber);
        this.firstName = CapitaliseForLetter.capitalise(firstName);
        this.lastName = CapitaliseForLetter.capitalise(lastName);
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    public void validateAge(int age) {
        boolean isInvalid = age < 0;
        if (isInvalid) throw new IllegalArgumentException("Invalid age");
    }
    public void validatePhoneNumber(String phoneNumber) {
        boolean isInvalid = phoneNumber.length() != 11;
        if (isInvalid) throw new IllegalArgumentException("Phone number is incomplete");
    }
    public void setFirstName(String firstName) {
        this.firstName = CapitaliseForLetter.capitalise(firstName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = CapitaliseForLetter.capitalise(lastName);
    }

    public void setPhoneNumber(String phoneNumber) {
        validatePhoneNumber(phoneNumber);
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
