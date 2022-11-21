package Practice;

import chapter03.exercises.Account;

public class BusDriver {
    private String name;
    private int age;
    private String phoneNumber;

    private Account myAccount;

    public BusDriver(String myName, int myAge, String phoneNumber) {
        name = myName;
        age = myAge;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String myName) {
        name = myName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
