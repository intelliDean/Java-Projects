package chapter15.account_file;

public class AccountXML {
    private int accountNumber;
    private String firstName;
    private String lastName;
    private double balance;

    public AccountXML() {       //no args constructor/default args
        this(0, "", "", 0.0);
    }
    public AccountXML(int accountNumber, String firstName, String lastName, double balance) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // set account number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // get first name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}