package chapter8;

public class Native {
    private  Human human;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;

    public Native(Human human) {
        age = human.getAge();      //age is validated from Human class.
        this.firstName = human.getFirstName();
        this.lastName = human.getLastName();
        this.phoneNumber = human.getPhoneNumber();      //phone number is validated from the Human class
    }
}