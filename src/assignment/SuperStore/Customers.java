package assignment.SuperStore;

import MyReusableCodes.PasswordValidator;

import java.util.ArrayList;

public class Customers {
    private Human firstName;
    private Human lastName;
    private Human age;
    private Address address;
    private String email;
    private String password;
    private Human phoneNumber;
    private Cart shoppingCart;
    private ArrayList<Billing> info;


    public Customers() {

    }
    /*^ represents starting character of the string.
(?=.*[0-9]) represents a digit must occur at least once.
(?=.*[a-z]) represents a lower case alphabet must occur at least once.
(?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
(?=.*[@#$%^&-+=()] represents a special character that must occur at least once.
(?=\\S+$) white spaces don’t allowed in the entire string.
.{8, 20} represents at least 8 characters and at most 20 characters.
$ represents the end of the string.*/
    public void setPassword(String password) {
        if (PasswordValidator.isValidPassword(password)) {
            this.password = password;
        } else {
            System.err.println("The password does not meet requirement.Please try again");
        }
    }
    public String getPassword() {
        return password;
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

    public Human getAge() {
        return age;
    }

    public void setAge(Human age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public Human getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Human phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Cart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Cart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public ArrayList<Billing> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<Billing> info) {
        this.info = info;
    }
}
