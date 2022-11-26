package chapter12.Polymophism.Employee;

import chapter8.DatePackage.Date;

public class HourlyEmployee extends Employee {
    private double wage; // wage per hour
    private double hours; // hours worked for week

    // constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours, Date date) {
        super(firstName, lastName, socialSecurityNumber, date);

         validateWage(wage);// validate wage
         validateHour(hours);// validate hours

        this.wage = wage;
        this.hours = hours;
    }
    private static void validateWage(double wage) {
        boolean isInvalid = wage < 0.0;
        if (isInvalid) { // validate wage
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
    }
    private static void validateHour(double hours) {
        boolean isInvalid = (hours < 0.0) || (hours > 168.0);
        if (isInvalid) { // validate hours
            throw new IllegalArgumentException(
                    "Hours worked must be >= 0.0 and <= 168.0");
        }
    }

    // set wage
    public void setWage(double wage) {
        validateWage(wage);
        this.wage = wage;
    }

    // return wage
    public double getWage() {
        return wage;
    }

    // set hours worked
    public void setHours(double hours) {
        validateHour(hours);
        this.hours = hours;
    }

    // return hours worked
    public double getHours() {
        return hours;
    }

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        if (getHours() <= 40) { // no overtime
            return getWage() * getHours();
        } else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5; //overtime
        }
    }

    // return String representation of HourlyEmployee object
    @Override
    public String toString() {
        return String.format("Hourly Employee: %s%n%s: $%,.2f; %n%s: %,.2f",
                super.toString(), "Hourly Wage", getWage(),
                "hours worked", getHours());
    }

    // Driver method to execute the class
//    public static void main(String[] args) {
//        Date date = new Date(12, 3, 1995);
//        HourlyEmployee hour = new HourlyEmployee("why", "you",
//                "211", 4552343.81, 54, date);
//
//        System.out.println(hour);
//       int month = hour.date.getMonth();
//        System.out.println(month);
//    }
}
