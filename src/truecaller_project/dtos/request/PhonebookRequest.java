package truecaller_project.dtos.request;

public class PhonebookRequest {
    private String ownersName;
    private String ownersPhoneNumber;
    private String name;
    private String phoneNumber;

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public String getOwnersPhoneNumber() {
        return ownersPhoneNumber;
    }

    public void setOwnersPhoneNumber(String ownersPhoneNumber) {
        this.ownersPhoneNumber = ownersPhoneNumber;
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
}
