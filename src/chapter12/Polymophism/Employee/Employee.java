package chapter12.Polymophism.Employee;

import chapter12.Polymophism.Interfaces.Payable.Payable;
import chapter8.DatePackage.Date;


public abstract class Employee implements Payable {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private Date birthMonth;

    // constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber, Date date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthMonth = date;
    }
    public int getBirthDay() {
        return birthMonth.getMonth();
    }

    // return first name
    public String getFirstName() {
        return firstName;
    }

    // return last name
    public String getLastName() {
        return lastName;
    }

    // return social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // return String representation of Employee object
    @Override
    public String toString() {
        return String.format("%s %s%nSocial Security Number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    // abstract method must be overridden by concrete subclasses
    public abstract double earnings(); // no implementation here

    public double getPaymentAmount() {
        return earnings();
    }
}
