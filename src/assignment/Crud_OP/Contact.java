package assignment.Crud_OP;

public class Contact {
    private final String firstName;
    private final String lastName;
    private Address address;
    private String telephone;
    private String email;
    private int id;



    public Contact(String firstName, String lastName, Address address, String telephone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }
    public Contact(String name, String lastName, String telephone) {
        this(name, lastName, null, telephone, null);
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s%n%-12s%-40s%n%-12s%-40s%n%-12s%-40s%n%-12s%-40s",
                "___________________________________________________________________________",
                "Name: ", firstName +" "+ lastName,
                "Address: ", address,
                "Telephone: ", telephone,
                "Email: ", email);
    }
}
