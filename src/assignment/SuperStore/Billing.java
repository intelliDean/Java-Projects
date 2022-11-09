package assignment.SuperStore;

public class Billing {
    private Human phoneNumber;
    private Human firstName;
    private Human lastName;
    private Address address;
    private CreditCard info;

    public Human getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Human phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Human getFirstName() {
        return firstName;
    }

    public void setFirstName(Human firstName) {
        this.firstName = firstName;
    }

    public Human getLastName() {
        return lastName;
    }

    public void setLastName(Human lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CreditCard getInfo() {
        return info;
    }

    public void setInfo(CreditCard info) {
        this.info = info;
    }
}
