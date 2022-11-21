package chapter03.exercises;

public class Account {
    private String name; // instance variable
    private double balance;

    public Account (String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void setName(String name) { // method to set the name in the object
        this.name = name; // store the name. (this.name refers to the instance variable)

    }
    // method to retrieve the name from the object
    public String getName() {
        return name; // return value of name to caller
    }
    public void deposit (double depositAmount) {
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
    }
    public void withdraw(double withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
        }
    }
    public double getBalance() {
        return balance;
    }
}
