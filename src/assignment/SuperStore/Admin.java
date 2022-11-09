package assignment.SuperStore;

public class Admin {
    private Human firstName;
    private Human lastName;
    private Human age;
    private Address address;
    private String email;
    private String password;
    private Human phoneNumber;

    public Admin(String email, String password) {
        validatePassword(password);
        this.email = email;
        this.password = password;
    }
    public void validatePassword(String password) {
        boolean isInvalid = password.length() < 8;
        if (isInvalid) throw new IllegalArgumentException("Password must be above 8 characters");
    }
}
