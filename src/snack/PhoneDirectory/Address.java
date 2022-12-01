package snack.PhoneDirectory;

public class Address {
    private String houseNumber;
    private String streetName;
    private String city;
    private String state;
    private String country;

    public Address(String houseNumber, String streetName, String city, String state, String country) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public Address(String houseNumber, String streetName, String city) {
        this(houseNumber, streetName, city, null, null);
    }

    public Address(String houseNumber, String streetName) {
        this(houseNumber, streetName, null);
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return String.format("%s, %s street, %s, %s, %s",
                getHouseNumber(), getStreetName(), getCity(), getState(), getCountry());
    }
}
